package com.chao.rabbitSolu.service;

import java.util.List;

/**
 * @ClassName WarehouseInfoService
 * @Author chao
 * @Time 2020/10/14 14:46
 * @Version 0.1
 **/

public interface WarehouseInfoService {
    /**
     * 仓库匹配策略
     * @param wIds
     * @param provinceCode
     * @param cityCode
     * @param district
     * @return
     */
     Long selectWarehouse(List<Long> wIds, Long provinceCode, Long cityCode, Long district);
}
