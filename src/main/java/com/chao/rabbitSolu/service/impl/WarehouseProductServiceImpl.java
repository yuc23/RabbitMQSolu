package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.bo.WarehouseProductBO;
import com.chao.rabbitSolu.dao.WarehouseProductDao;
import com.chao.rabbitSolu.service.WarehouseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName WarehouseProductServiceImpl
 * @Author chao
 * @Time 2020/10/13 23:05
 * @Version 0.1
 **/
@Service
public class WarehouseProductServiceImpl implements WarehouseProductService {
    @Autowired
    private WarehouseProductDao warehouseProductDao;
    /**
     * 查询库存
     *
     * @param productId
     * @return
     */
    @Override
    public WarehouseProductBO selectStock(Long productId) {
        WarehouseProductBO warehouseProductBO = new WarehouseProductBO();
        List stocks = warehouseProductDao.selectStockFromProductId(productId);
        if(stocks == null || stocks.isEmpty()){
            //设置没有库存
            warehouseProductBO.setStock(true);
            return warehouseProductBO;
        }

        return null;
    }
}
