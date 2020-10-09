package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetail {
  private Long orderDetailId;
  private Long orderId;
  private Long productId;
  private String productName;
  private Long productCnt;
  private Double productPrice;
  private Double averageCost;
  private Double weight;
  private Double feeMoney;
  private Long wId;
  private java.sql.Timestamp modifiedTime;
}
