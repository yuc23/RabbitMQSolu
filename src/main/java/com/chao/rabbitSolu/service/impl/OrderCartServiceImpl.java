package com.chao.rabbitSolu.service.impl;

import com.chao.rabbitSolu.model.OrderCart;
import com.chao.rabbitSolu.service.OrderCartService;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Service;

/**
 * @ClassName${Class_NAME}
 * @Author chao
 * @Time 2020/10/12 22:37
 * @Version 0.1
 **/
@Service
public class OrderCartServiceImpl implements OrderCartService {

    /**
     * 商品添加购物车使用缓存，添加是否下单状态
     *
     * @param orderCart
     */
    @Override
    public void addGoodsIntoOrderCart(OrderCart orderCart) {

    }

    /**
     * 下单接口
     * 下单逻辑
     * 下单检查目前库存，锁定资源，调用支付接口，超时未支付自动取消
     *
     * @param orderCart
     */
    @Override
    public void placeOrder(OrderCart orderCart) {

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
