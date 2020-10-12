package com.chao.rabbitSolu.service;

import com.chao.rabbitSolu.model.OrderCart;

/**
 * @ClassName OrderCartService 购物车
 * @Author chao
 * @Time 2020/10/12 18:14
 * @Version 0.1
 **/

public interface OrderCartService {
    /**
     * 商品添加购物车使用缓存，添加是否下单状态
     */
    void addGoodsIntoOrderCart(OrderCart orderCart);

    /**
     * 下单接口
     * 下单逻辑
     * 下单检查目前库存，调用支付接口，超时未支付自动取消
     */
    void placeOrder(OrderCart orderCart);

    /**
     * 超时取消或者下单后取消
     * 校验订单是否已支付
     */
    void cancelOrder(Long customerId,Long orderId);

}
