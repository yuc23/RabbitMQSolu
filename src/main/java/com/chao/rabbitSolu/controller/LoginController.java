package com.chao.rabbitSolu.controller;

import com.chao.rabbitSolu.model.CustomerLogin;
import com.chao.rabbitSolu.service.CustomerLoginService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private CustomerLoginService customerLoginService;
    @PostMapping("/login")
    public void login(@RequestParam String user, @RequestParam String password){
            rabbitTemplate.convertAndSend("logChange", "logBinding", "qqqqqq", new CorrelationData("2121212121"));

    }
    @PostMapping("/register")
    public void register(@RequestBody CustomerLogin customerLogin){
        customerLoginService.addCustomer(customerLogin);
    }

}
