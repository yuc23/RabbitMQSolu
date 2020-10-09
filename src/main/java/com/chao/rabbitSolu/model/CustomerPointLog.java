package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerPointLog {
  private Long pointId;
  private Long customerId;
  private Long source;
  private Long referNumber;
  private Long changePoint;
  private java.sql.Timestamp createTime;
}
