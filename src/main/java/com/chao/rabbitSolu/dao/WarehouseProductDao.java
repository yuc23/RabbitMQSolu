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
    @Query(value = "update warehouse_product set lock_cnt =lock_cnt+1 where product_id =:productId AND w_id =:wId",nativeQuery = true)
    void updateProductLockCnt(Long productId,Long wId);
    @Query(value = "SELECT * from warehouse_product where product_id = :productId",nativeQuery = true)
    List<WarehouseProduct> selectStockFromProductId(Long productId);
}
