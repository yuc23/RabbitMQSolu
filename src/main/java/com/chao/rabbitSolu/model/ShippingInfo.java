package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShippingInfo {
  private Long shipId;
  private String shipName;
  private String shipContact;
  private String telephone;
  private Double price;
  private java.sql.Timestamp modifiedTime;

}
