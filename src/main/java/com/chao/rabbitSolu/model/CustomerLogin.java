package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLogin {
  private Long customerId;
  private String loginName;
  private String password;
  private Long userStats;
  private java.sql.Timestamp modifiedTime;

}
