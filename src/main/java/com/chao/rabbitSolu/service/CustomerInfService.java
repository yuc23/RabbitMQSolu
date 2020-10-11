package com.chao.rabbitSolu.service;

import com.chao.rabbitSolu.model.CustomerInf;

import java.sql.Timestamp;

/**
 * @ClassName CustomerInfService
 * @Author chao
 * @Time 2020/10/11 20:43
 * @Version 0.1
 **/

public interface CustomerInfService {
    /**
     * 初始化用户资料
     * @param customerId
     * @param customerName
     * @return
     */
    void initCustomerInf(Long customerId, String customerName);

    /**
     * 更新用户资料
     *
     */
    void updateCustomerInf(CustomerInf customerInf);
}
