package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderMaster {
  private Long orderId;
  private Long orderSn;
  private Long customerId;
  private String shippingUser;
  private Long province;
  private Long city;
  private Long district;
  private String address;
  private Long paymentMethod;
  private Double orderMoney;
  private Double districtMoney;
  private Double shippingMoney;
  private Double paymentMoney;
  private String shippingCompName;
  private String shippingSn;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp shippingTime;
  private java.sql.Timestamp payTime;
  private java.sql.Timestamp receiveTime;
  private Long orderStatus;
  private Long orderPoint;
  private String invoiceTime;
  private java.sql.Timestamp modifiedTime;

}
