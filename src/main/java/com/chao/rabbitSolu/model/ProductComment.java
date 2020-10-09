package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductComment {
  private Long commentId;
  private Long productId;
  private Long orderId;
  private Long customerId;
  private String title;
  private String content;
  private Long auditStatus;
  private java.sql.Timestamp auditTime;
  private java.sql.Timestamp modifiedTime;

}
