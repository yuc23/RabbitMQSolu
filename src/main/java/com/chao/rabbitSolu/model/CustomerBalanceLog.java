package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerBalanceLog {
  private Long balanceId;
  private Long customerId;
  private Long source;
  private Long sourceSn;
  private java.sql.Timestamp createTime;
  private Double amount;
}
