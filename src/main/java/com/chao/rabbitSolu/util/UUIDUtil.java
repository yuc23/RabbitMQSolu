package com.chao.rabbitSolu.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName UUIDUtil 序列号生成工具
 * @Author chao
 * @Time 2020/10/10 14:28
 * @Version 0.1
 **/
@Service
public class UUIDUtil {
    @Autowired
    RedisUtil redisUtil;
    //后续采用redis储存
    public Long customerIdGenerator(){
        String currentDate = new SimpleDateFormat("yyMMdd").format(new Date());
        String id = redisUtil.getIncrementId("customerGeneratorId",1);
        return Long.parseLong(currentDate+id);
    }
}
