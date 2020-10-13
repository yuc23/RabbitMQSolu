package com.chao.rabbitSolu.dao;

import com.chao.rabbitSolu.model.WarehouseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/13 21:23
 * @Version 0.1
 **/
@Repository
public interface WarehouseProductDao extends JpaRepository<WarehouseProduct,Long>{
    @Query(value = "update warehouse_product set lock_cnt =:lockCnt where product_id =:productId",nativeQuery = true)
    void updateProductLockCnt(Long productId,Long lockCnt);
    @Query(value = "SELECT w_id,current_cnt,lock_cnt from warehouse_product where product_id = :productId")
    List selectStockFromProductId(Long productId);
}
