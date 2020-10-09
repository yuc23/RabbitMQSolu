package com.chao.rabbitSolu.model;

import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLevelInf {
  private Long customerLevel;
  private String levelName;
  private Long minPoint;
  private Long maxPoint;
  private java.sql.Timestamp modifiedTime;
}
