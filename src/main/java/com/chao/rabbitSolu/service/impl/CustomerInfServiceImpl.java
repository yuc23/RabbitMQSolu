package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.common.TypeEnum;
import com.chao.rabbitSolu.dao.CustomerInfDao;
import com.chao.rabbitSolu.model.CustomerInf;
import com.chao.rabbitSolu.service.CustomerInfService;
import com.chao.rabbitSolu.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @ClassName CustomerInfServiceImpl
 * @Author chao
 * @Time 2020/10/11 21:07
 * @Version 0.1
 **/
@Service
public class CustomerInfServiceImpl implements CustomerInfService{
    @Autowired
    private CustomerInfDao customerInfDao;

    @Override
    public void initCustomerInf( Long customerId, String customerName) {
        CustomerInf customerInf  = new CustomerInf();
        Timestamp timestamp = DateUtil.parseDateFormat(TypeEnum.dateFormatType.TYPE_1.getCode());
        customerInf.setCustomerInfId(customerId);
        customerInf.setCustomerId(customerId);
        customerInf.setCustomerLevel(TypeEnum.customerLevelType.ORDINARY.getCode());
        customerInf.setCustomerName(customerName);
        customerInf.setUserMoney(0.00D);
        customerInf.setUserPoint(0L);
        customerInf.setModifiedTime(timestamp);
        customerInf.setRegisterTime(timestamp);
        customerInfDao.save(customerInf);
    }

    /**
     * 更新用户资料
     *
     * @param customerInf
     */
    @Override
    public void updateCustomerInf(CustomerInf customerInf) {

    }

}
