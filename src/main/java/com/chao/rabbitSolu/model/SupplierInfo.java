package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierInfo {
  private Long supplierId;
  private String supplierCode;
  private String supplierName;
  private Long supplierType;
  private String linkMan;
  private String phoneNumber;
  private String bankName;
  private String bankAccount;
  private String address;
  private Long supplierStatus;
  private java.sql.Timestamp modifiedTime;

}
