package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseProduct {
  private Long wpId;
  private Long productId;
  private Long wId;
  private Long currentCnt;
  private Long lockCnt;
  private Long inTransitCnt;
  private Double averageCost;
  private java.sql.Timestamp modifiedTime;
}
