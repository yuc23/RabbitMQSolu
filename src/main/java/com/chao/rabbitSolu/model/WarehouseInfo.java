package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WarehouseInfo {
  private Long wId;
  private String warehouseSn;
  private String warehoustName;
  private String warehousePhone;
  private String contact;
  private Long province;
  private Long city;
  private Long distrct;
  private String address;
  private Long warehouseStatus;
  private java.sql.Timestamp modifiedTime;

}
