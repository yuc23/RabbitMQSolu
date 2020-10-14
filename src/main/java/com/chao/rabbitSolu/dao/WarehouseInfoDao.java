package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.model.WarehouseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName WarehouseInfoDao
 * @Author chao
 * @Time 2020/10/14 14:37
 * @Version 0.1
 **/
@Repository
public interface WarehouseInfoDao extends JpaRepository<WarehouseInfo,Long>{
    @Query(value = "SELECT  w_id FROM warehouse_info WHERE distrct =:district",nativeQuery = true)
    List<Long> selectWIdwithDistrct(Long district);


    @Query(value = "SELECT  w_id FROM warehouse_info WHERE city =:city",nativeQuery = true)
    List<Long> selectWIdwithCity(Long city);

    @Query(value = "SELECT  w_id FROM warehouse_info WHERE province =:province",nativeQuery = true)
    List<Long> selectWIdwithProvince(Long province);
}
