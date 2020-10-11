package com.chao.rabbitSolu.config;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * @ClassName RedisConfig
 * @Author chao
 * @Time 2020/10/10 15:42
 * @Version 0.1
 **/
@Configuration
public class RedisConfig {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RedisConfig.class);
    @Autowired
    private RedisTemplate redisTemplate;
    @Bean
    public RedisTemplate getRedisTemplate() {
        return this.redisTemplate;
    }
}
