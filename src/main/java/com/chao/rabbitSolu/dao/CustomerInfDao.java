package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.config.RabbitConfig;
import com.chao.rabbitSolu.model.CustomerInf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/9 20:52
 * @Version 0.1
 **/
@Repository
public interface CustomerInfDao extends JpaRepository<CustomerInf,Long> {
    @Query(value = "UPDATE customer_inf SET identity_card_type =:identyCardType,identity_card_no =:identityCardNo,mobile_phone=:mobilePhone,customer_email =:customerEmail,gender =:gender,birthday =:birthDay,modified_time =:modifyTime WHERE customer_inf_id =:customerInfId",nativeQuery = true)
    void updateCustomerInf(Long customerInfId, Long identityCardType, String identityCardNo, String mobilePhone, String customerEmail, String gender, Timestamp birthDay,Timestamp modifyTime);
}
