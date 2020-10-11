package com.chao.rabbitSolu.service;

import com.chao.rabbitSolu.dao.CustomerInfDao;
import com.chao.rabbitSolu.dao.CustomerLoginDao;
import com.chao.rabbitSolu.model.CustomerInf;
import com.chao.rabbitSolu.model.CustomerLogin;
import com.chao.rabbitSolu.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ${Class_NAME}
 * @Author chao
 * @Time 2020/10/9 21:25
 * @Version 0.1
 **/
@Service
public class CustomerLoginService {
    @Autowired
    private CustomerLoginDao customerLoginDao;
    @Autowired
    private CustomerInfDao customerInfDao;
    @Autowired
    private UUIDUtil uuidUtil;
    public void addCustomer(CustomerLogin customerLogin){
        Long customerId = uuidUtil.customerIdGenerator();
        customerLogin.setCustomerId(customerId);
        customerLoginDao.save(customerLogin);
        CustomerInf customerInf  = new CustomerInf();
        customerInf.setCustomerId(customerId);
        customerInf.setCustomerName(customerLogin.getLoginName());
        customerInfDao.save(customerInf);
    }
}
