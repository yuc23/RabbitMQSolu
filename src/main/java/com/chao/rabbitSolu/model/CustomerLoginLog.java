package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLoginLog {
  private Long loginId;
  private Long customerId;
  private java.sql.Timestamp loginTime;
  private Long loginIp;
  private Long loginType;

}
