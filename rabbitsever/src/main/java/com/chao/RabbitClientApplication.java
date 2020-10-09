package com.chao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/8 22:46
 * @Version 0.1
 **/
@SpringBootApplication
public class RabbitClientApplication {
    private static final Logger logger = LoggerFactory.getLogger(RabbitClientApplication.class);
    @Autowired(required = false)
    private SimpleRabbitListenerContainerFactoryConfigurer factoryConfigurer;
    @Autowired(required = false)
    private CachingConnectionFactory connectionFactory;
    public static void main(String[] args) {
        SpringApplication.run(RabbitClientApplication.class);
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
}
