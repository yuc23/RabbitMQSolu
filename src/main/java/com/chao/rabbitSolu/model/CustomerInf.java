package com.chao.rabbitSolu.model;
import lombok.*;

import javax.persistence.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CustomerInf {
  @Id
  private Long customerInfId;
  private Long customerId;
  private String customerName;
  private Long identityCardType;
  private String identityCardNo;
  private Long mobilePhone;
  private String customerEmail;
  private String gender;
  private Long userPoint;
  private java.sql.Timestamp registerTime;
  private java.sql.Timestamp birthday;
  private Long customerLevel;
  private Double userMoney;
  private java.sql.Timestamp modifiedTime;

}
