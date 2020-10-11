package com.chao.rabbitSolu.common;

/**
 * @ClassName 枚举类
 * @Author chao
 * @Time 2020/10/11 16:11
 * @Version 0.1
 **/

public class TypeEnum {
    /**
     * 会员级别类型
     * 普通、青铜、白银、黄金、钻石
     */
    public enum customerLevelType{
        ORDINARY(1L),BRONZE(2L),SILVER(3L),GOLD(4L),DIAMONDS(5L);
        private Long code;
        customerLevelType(Long code){
            this.code = code;
        }
        public Long getCode(){
            return code;
        }
    }
    /**
     * 时间格式类型
     */
    public enum dateFormatType{
        TYPE_1("yyyy-MM-dd HH:mm:ss"),TYPE_2("yyyyMMdd HHmmss");
        private String code;
        dateFormatType(String code){
            this.code = code;
        }
        public String getCode(){
            return code;
        }
    }
}
