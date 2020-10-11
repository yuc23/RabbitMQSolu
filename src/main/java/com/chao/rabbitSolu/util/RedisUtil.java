package com.chao.rabbitSolu.util;

import com.chao.rabbitSolu.config.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

/**
 * @ClassName RedisUtil
 * @Author chao
 * @Time 2020/10/10 16:07
 * @Version 0.1
 **/
@Service
public class RedisUtil {
    @Autowired
    private RedisConfig redisConfig;
    public String getIncrementId(String key,int delta){
        redisConfig.getRedisTemplate().setKeySerializer(new StringRedisSerializer());
        redisConfig.getRedisTemplate().setValueSerializer(new StringRedisSerializer());
        long Id = redisConfig.getRedisTemplate().opsForValue().increment(key, delta);
        return String.format("%04d", Id);
    }
}
