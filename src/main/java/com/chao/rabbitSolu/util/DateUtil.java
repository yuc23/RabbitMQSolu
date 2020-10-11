package com.chao.rabbitSolu.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtil 时间工具类
 * @Author chao
 * @Time 2020/10/11 16:51
 * @Version 0.1
 **/

public class DateUtil {
    private static final String dateFormat = "yyyy-MM-dd HH:mm:ss";
    public static Timestamp parseDateFormat(String dateFormatStr){
        SimpleDateFormat format = new SimpleDateFormat(dateFormatStr);
        try {

            Timestamp ts = new Timestamp(format.parse(format.format(new Date())).getTime());
            return ts;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
