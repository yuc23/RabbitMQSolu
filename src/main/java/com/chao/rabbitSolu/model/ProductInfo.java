package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInfo {
  private Long productId;
  private String productCore;
  private String productName;
  private String barCode;
  private Long brandId;
  private Long oneCategoryId;
  private Long twoCategoryId;
  private Long threeCategoryId;
  private Long supplierId;
  private Double price;
  private Double averageCost;
  private Long publishStatus;
  private Long auditStatus;
  private Double weight;
  private Double length;
  private Double height;
  private Double width;
  private String colorType;
  private java.sql.Timestamp productionDate;
  private Long shelfLife;
  private String descript;
  private java.sql.Timestamp indate;
  private java.sql.Timestamp modifiedTime;

}
