package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.dao.WarehouseInfoDao;
import com.chao.rabbitSolu.service.WarehouseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName WarehouseInfoServiceImpl
 * @Author chao
 * @Time 2020/10/14 16:09
 * @Version 0.1
 **/
@Service
public class WarehouseInfoServiceImpl implements WarehouseInfoService{
    @Autowired
    private WarehouseInfoDao warehouseInfoDao;
    /**
     * 仓库匹配策略
     * @param wIds
     * @param provinceCode
     * @param cityCode
     * @param district
     * @return
     */
    @Override
    public Long selectWarehouse(List<Long> wIds,Long provinceCode, Long cityCode, Long district) {
        //省市区逐级查询
        List<Long> districtWIds =  warehouseInfoDao.selectWIdwithDistrct(district);
        if(districtWIds != null && !districtWIds.isEmpty()){
            List<Long> districtWIdsSorted = districtWIds.stream().filter(districtWId->wIds.contains(districtWId)).collect(Collectors.toList());
            if(districtWIdsSorted != null && !districtWIdsSorted.isEmpty()){
                return districtWIdsSorted.get(0);
            }
        }
        List<Long> cityWIds =  warehouseInfoDao.selectWIdwithDistrct(cityCode);
        if(cityWIds != null && !cityWIds.isEmpty()) {
            List<Long> cityWIdsSorted = cityWIds.stream().filter(cityWId->wIds.contains(cityWId)).collect(Collectors.toList());
            if(cityWIdsSorted != null && !cityWIdsSorted.isEmpty()){
                return cityWIdsSorted.get(0);
            }
        }

        List<Long> provinceWIds =  warehouseInfoDao.selectWIdwithDistrct(provinceCode);
        if(provinceWIds != null && !provinceWIds.isEmpty()) {
            List<Long> provinceWIdsSorted = provinceWIds.stream().filter(provinceWId->wIds.contains(provinceWId)).collect(Collectors.toList());
            if(provinceWIdsSorted != null && !provinceWIdsSorted.isEmpty()){
                return provinceWIdsSorted.get(0);
            }
        }
        return wIds.get(0);
    }
}
