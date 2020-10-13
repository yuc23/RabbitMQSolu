package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.model.OrderCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/13 20:52
 * @Version 0.1
 **/
@Repository
public interface OrderCartDao extends JpaRepository<OrderCart,Long> {
}
