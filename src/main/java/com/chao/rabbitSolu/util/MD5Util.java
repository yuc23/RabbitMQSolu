package com.chao.rabbitSolu.util;


import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/11 22:17
 * @Version 0.1
 **/

public class MD5Util {

    /**
     * 加密方式
     */
    private static final String ALGORITHM_NAME = "MD5";

    /**
     * 默认盐值
     */
    private static final String DEFAULT_SALT = "LSQCHAO";

    /**
     * 默认加密次数
     */
    private static final int DEFAULT_ITERATIONS = 1024;

    /**
     * 返回盐值
     *
     * @return private static final String SALT 盐值
     */
    public static String getDefaultSalt() {
        return DEFAULT_SALT;
    }
    /**
     * 返回加密次数
     *
     * @return private static final int HASHITERATIONS 加密次数
     */
    public static int getDefaultIterations() {
        return DEFAULT_ITERATIONS;
    }

    /**
     * MD5加密
     *
     * @param source 待加密源数据
     * @return md5's string
     */
    public static String md5String(String source) {
        return new SimpleHash(ALGORITHM_NAME, source, DEFAULT_SALT, DEFAULT_ITERATIONS).toString();
    }

    /**
     * MD5加密
     *
     * @param source 待加密源数据
     * @param salt 盐值
     * @return md5's string
     */
    public static String md5String(String source, String salt) {
        return new SimpleHash(ALGORITHM_NAME, source, salt, DEFAULT_ITERATIONS).toString();
    }

    /**
     * MD5加密
     *
     * @param source 待加密源数据
     * @param salt 盐值
     * @param iterations 加密次数
     * @return md5's string
     */
    public static String md5String(String source, String salt, int iterations) {
        return new SimpleHash(ALGORITHM_NAME, source, salt, iterations).toString();
    }
    public static String encode(String password) {
        return md5String(password);
    }
}
