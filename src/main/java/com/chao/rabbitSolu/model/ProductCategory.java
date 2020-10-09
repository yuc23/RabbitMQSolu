package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategory {
  private Long categoryId;
  private String categoryName;
  private String categoryCode;
  private Long parentId;
  private Long categoryLevel;
  private Long categoryStatus;
  private java.sql.Timestamp modifiedTime;

}
