package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCart {
  private Long cartId;
  private Long customerId;
  private Long productId;
  private Long productAmount;
  private Double price;
  private java.sql.Timestamp addTime;
  private java.sql.Timestamp modifiedTime;

}
