package com.chao.rabbitSolu.vo;

import lombok.*;

/**
 * @ClassName OrderVo
 * @Author chao
 * @Time 2020/10/13 22:01
 * @Version 0.1
 **/
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderVo {
    private Long customerId;
    private String shippingUser;
    private Long province;
    private Long city;
    private Long district;
    private String address;
    private Long productId;
    private String productName;
    private Long productCnt;
    private Double productPrice;
    private Double averageCost;
    private Double weight;
    private Double feeMoney;

}
