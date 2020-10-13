package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/13 21:10
 * @Version 0.1
 **/
@Repository
public interface ProductInfoDao extends JpaRepository<ProductInfo,Long>{
}
