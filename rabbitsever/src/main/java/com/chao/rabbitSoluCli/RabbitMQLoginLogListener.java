package com.chao.rabbitSoluCli;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName RabbitMQLoginLogListener
 * @Author chao
 * @Time 2020/10/8 21:22
 * @Version 0.1
 **/
@Service
public class RabbitMQLoginLogListener {
    @RabbitListener(queues = "logQueue",containerFactory = "singleConsumer")
    public void loginLogListener(Message message, Channel channel){
        Object obj  = message.getPayload();
        System.out.println(obj.toString());
    }
}
