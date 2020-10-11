package com.chao.rabbitSolu.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.lang.Nullable;

/**
 * @ClassName RabbitConfig
 * @Author chao
 * @Time 2020/10/8 15:03
 * @Version 0.1
 **/

@Configuration
public class RabbitConfig {
    private static final Logger logger = LoggerFactory.getLogger(RabbitConfig.class);
    @Autowired(required = false)
    private CachingConnectionFactory connectionFactory;
    @Autowired
    private Environment environment;
    @Autowired(required = false)
    private SimpleRabbitListenerContainerFactoryConfigurer factoryConfigurer;
    @Bean
    public RabbitTemplate rabbitTemplate(){
        logger.info("初始化生产者容器.....");
        connectionFactory.setPublisherConfirms(true);
        connectionFactory.setPublisherReturns(true);
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(@Nullable CorrelationData correlationData, boolean b, @Nullable String cause) {

            }
        };
        rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if(ack){
                logger.info("消息发送成功：correlationData（{}）,ack({})",correlationData,cause);
            }else{
                logger.info("消息发送失败，失败原因（{}）",cause);
            }
        });
        rabbitTemplate.setReturnCallback((msg, repCode, repText, exchange, routingkey) ->{
            logger.info("消息发送失败，失败原因（{}）",msg.toString());
        });
        return rabbitTemplate;
    }
    @Bean(name = "singleConsumer")
    public SimpleRabbitListenerContainerFactory listenerContainer(){
        logger.info("初始单消费者监听容器.....");
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factoryConfigurer.configure(factory,connectionFactory);
        factory.setConnectionFactory(connectionFactory);
       // factory.setMessageConverter(new Jackson2JsonMessageConverter());
        factory.setConcurrentConsumers(1);
        factory.setMaxConcurrentConsumers(1);
        factory.setPrefetchCount(1);
        factory.setTxSize(1);
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        return factory;
    }
    @Bean(name = "multiConsumer")
    public SimpleRabbitListenerContainerFactory multiListenerContainer(){
        logger.info("初始化多消费者监听容器.....");
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factoryConfigurer.configure(factory,connectionFactory);
       // factory.setMessageConverter(new Jackson2JsonMessageConverter());
        factory.setAcknowledgeMode(AcknowledgeMode.NONE);
        factory.setConcurrentConsumers(environment.getProperty("spring.rabbitmq.listener.concurrency",int.class));
        factory.setMaxConcurrentConsumers(environment.getProperty("spring.rabbitmq.listener.max-concurrency",int.class));
        factory.setPrefetchCount(environment.getProperty("spring.rabbitmq.listener.prefetch",int.class));
        return factory;
    }
    @Bean(name = "logque")
    public Queue queue(){
        logger.info("新增队列");
        return new Queue("logQueue",true);
    }
    @Bean
    public DirectExchange directExchange(){
        logger.info("新增exchange");
        return new DirectExchange("logChange",true,false);
    }
    @Bean
    public Binding binding(){
        logger.info("新增binding");
        return BindingBuilder.bind(queue()).to(directExchange()).with("logBinding");
    }
}
