package com.chao.rabbitSolu.model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CustomerLogin {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long customerId;
  private String loginName;
  private String password;
  private Long userStats;
  private java.sql.Timestamp modifiedTime;

}
