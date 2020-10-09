package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductPicInfo {
  private Long productPicId;
  private Long productId;
  private String picDesc;
  private String picUrl;
  private Long isMaster;
  private Long picOrder;
  private Long picStatus;
  private java.sql.Timestamp modifiedTime;
}
