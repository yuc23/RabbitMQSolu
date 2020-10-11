package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.model.CustomerLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/9 21:26
 * @Version 0.1
 **/
@Repository
public interface CustomerLoginDao extends JpaRepository<CustomerLogin,Integer>{
}
