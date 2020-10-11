package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerAddr {
  private Long customerAddrId;
  private Long customerId;
  private Long zip;
  private Long province;
  private Long city;
  private Long district;
  private String address;
  private Long isDefault;
  private java.sql.Timestamp modifiedTime;

}
