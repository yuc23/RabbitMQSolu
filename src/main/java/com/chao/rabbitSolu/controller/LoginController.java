package com.chao.rabbitSolu.controller;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @Author chao
 * @Time 2020/10/8 20:14
 * @Version 0.1
 **/
@RestController
@RequestMapping("/system")
public class LoginController {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @PostMapping("/login")
    public void login(@RequestParam String user, @RequestParam String password){
            rabbitTemplate.convertAndSend("logChange", "logBinding", "qqqqqq", new CorrelationData("2121212121"));

    }
}
