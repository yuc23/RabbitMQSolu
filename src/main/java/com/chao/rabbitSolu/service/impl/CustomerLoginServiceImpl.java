package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.common.TypeEnum;
import com.chao.rabbitSolu.dao.CustomerInfDao;
import com.chao.rabbitSolu.dao.CustomerLoginDao;
import com.chao.rabbitSolu.model.CustomerInf;
import com.chao.rabbitSolu.model.CustomerLogin;
import com.chao.rabbitSolu.service.CustomerInfService;
import com.chao.rabbitSolu.service.CustomerLoginService;
import com.chao.rabbitSolu.util.DateUtil;
import com.chao.rabbitSolu.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @ClassName ${Class_NAME}
 * @Author chao
 * @Time 2020/10/9 21:25
 * @Version 0.1
 **/
@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{
    @Autowired
    private CustomerLoginDao customerLoginDao;
    @Autowired
    private UUIDUtil uuidUtil;
    @Autowired
    private CustomerInfService customerInfService;
    public void addCustomer(CustomerLogin customerLogin){
        Long customerId = uuidUtil.customerIdGenerator();
        customerLogin.setCustomerId(customerId);
        customerLoginDao.save(customerLogin);
        /*初始化用户资料*/
        customerInfService.initCustomerInf(customerId,customerLogin.getLoginName());;

    }
}
