package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandInfo {
  private Long brandId;
  private String brandName;
  private String telephone;
  private String brandWeb;
  private String brandLogo;
  private String brandDesc;
  private Long brandStatus;
  private Long brandOrder;
  private java.sql.Timestamp modifiedTime;

}
