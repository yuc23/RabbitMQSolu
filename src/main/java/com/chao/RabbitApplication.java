package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/8 17:29
 * @Version 0.1
 **/
@SpringBootApplication(scanBasePackages ={"com.chao.rabbitSolu"})
public class RabbitApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class);
    }
}
