package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.config.RabbitConfig;
import com.chao.rabbitSolu.model.CustomerInf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/9 20:52
 * @Version 0.1
 **/
@Repository
public interface CustomerInfDao extends JpaRepository<CustomerInf,Long> {
}
