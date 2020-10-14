package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.bo.WarehouseProductBO;
import com.chao.rabbitSolu.config.RedisConfig;
import com.chao.rabbitSolu.dao.OrderCartDao;
import com.chao.rabbitSolu.dao.WarehouseProductDao;
import com.chao.rabbitSolu.model.OrderCart;
import com.chao.rabbitSolu.model.OrderDetail;
import com.chao.rabbitSolu.model.OrderMaster;
import com.chao.rabbitSolu.service.OrderCartService;
import com.chao.rabbitSolu.service.WarehouseProductService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName OrderCartServiceImpl
 * @Author chao
 * @Time 2020/10/12 22:37
 * @Version 0.1
 **/
@Service
public class OrderCartServiceImpl implements OrderCartService {
    @Autowired
    private RedisConfig redisConfig;
    @Autowired
    private OrderCartDao orderCartDao;
    @Autowired
    private WarehouseProductService warehouseProductService;
    @Autowired
    private WarehouseProductDao warehouseProductDao;
    /**
     * 商品添加购物车使用缓存，添加是否下单状态
     *
     * @param orderCart
     */
    @Override
    public void addGoodsIntoOrderCart(OrderCart orderCart) {

        RedisTemplate redisTemplate = redisConfig.getRedisTemplate();
        //入缓存
        redisTemplate.opsForValue().set(orderCart.getCustomerId(),orderCart,1L, TimeUnit.DAYS);
        //入库
        orderCartDao.save(orderCart);

    }

    /**
     * 下单接口
     * 下单逻辑
     * 下单检查目前库存，锁定资源，调用支付接口，超时未支付自动取消
     *
     * @param orderDetail
     * @param orderMaster
     */
    @Override
    public void placeOrder(OrderDetail orderDetail,OrderMaster orderMaster) {
        //锁定资源，先减库存。
        Long productId = orderDetail.getProductId();
        //根据库房策略选库房
        WarehouseProductBO warehouseProductBO = warehouseProductService.selectStock(productId,orderMaster.getProvince(),orderMaster.getCity(),orderMaster.getDistrict());
        if (warehouseProductBO.isStock()){

        }
        warehouseProductDao.updateProductLockCnt(productId,warehouseProductBO.getSelectedWId());
    }

    /**
     * 超时取消或者下单后取消，释放商品资源
     * 校验订单是否已支付
     *
     * @param customerId
     * @param orderId
     */
    @Override
    public void cancelOrder(Long customerId, Long orderId) {

    }
}
