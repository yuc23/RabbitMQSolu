package com.chao.rabbitSolu.service;

import com.chao.rabbitSolu.bo.WarehouseProductBO;


/**
 * @ClassName WarehouseProductService
 * @Author chao
 * @Time 2020/10/13 22:40
 * @Version 0.1
 **/

public interface WarehouseProductService {
    /**
     * 查询库存
     * @param productId
     * @return
     */
    WarehouseProductBO selectStock(Long productId);
}