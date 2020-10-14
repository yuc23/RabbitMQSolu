package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.bo.WarehouseProductBO;
import com.chao.rabbitSolu.dao.WarehouseProductDao;
import com.chao.rabbitSolu.model.WarehouseProduct;
import com.chao.rabbitSolu.service.WarehouseInfoService;
import com.chao.rabbitSolu.service.WarehouseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired
    private WarehouseInfoService warehouseInfoService;

    /**
     * 查询库存
     *
     * @param productId
     * @return
     */
    @Override
    public WarehouseProductBO selectStock(Long productId, Long provinceCode, Long cityCode, Long district) {
        WarehouseProductBO warehouseProductBO = new WarehouseProductBO();
        List<WarehouseProduct> stocks = warehouseProductDao.selectStockFromProductId(productId);
        if(stocks == null || stocks.isEmpty()){
            //设置没有库存
            warehouseProductBO.setStock(true);
            return warehouseProductBO;
        }

        List<WarehouseProduct> collectStocks = stocks.stream().filter(s->s.getCurrentCnt()>s.getLockCnt()).collect(Collectors.toList());
        if(collectStocks == null || collectStocks.isEmpty()){
            //设置没有库存
            warehouseProductBO.setStock(true);
            return warehouseProductBO;
        }
        List<Long> wIds = new LinkedList <>();
        collectStocks.forEach(warehouseProduct -> wIds.add(warehouseProduct.getWId()));
        //筛选出库存后，库房选择策略
        Long wId = warehouseInfoService.selectWarehouse(wIds,provinceCode,cityCode,district);
        //选出库房后，锁定库存
        warehouseProductDao.updateProductLockCnt(productId,wId);
        warehouseProductBO.setStock(false);
        warehouseProductBO.setSelectedWarehouse(wId);
        return warehouseProductBO;
    }
}
