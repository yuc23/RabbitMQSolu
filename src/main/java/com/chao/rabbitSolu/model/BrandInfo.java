package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrandInfo {
  private Long brand_id;
  private String brand_name;
  private String telephone;
  private String brand_web;
  private String brand_logo;
  private String brand_desc;
  private Long brand_status;
  private Long brand_order;
  private java.sql.Timestamp modified_time;

  public Long getBrand_id() {
    return brand_id;
  }

  public void setBrand_id(Long brand_id) {
    this.brand_id = brand_id;
  }

  public String getBrand_name() {
    return brand_name;
  }

  public void setBrand_name(String brand_name) {
    this.brand_name = brand_name;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getBrand_web() {
    return brand_web;
  }

  public void setBrand_web(String brand_web) {
    this.brand_web = brand_web;
  }

  public String getBrand_logo() {
    return brand_logo;
  }

  public void setBrand_logo(String brand_logo) {
    this.brand_logo = brand_logo;
  }

  public String getBrand_desc() {
    return brand_desc;
  }

  public void setBrand_desc(String brand_desc) {
    this.brand_desc = brand_desc;
  }

  public Long getBrand_status() {
    return brand_status;
  }

  public void setBrand_status(Long brand_status) {
    this.brand_status = brand_status;
  }

  public Long getBrand_order() {
    return brand_order;
  }

  public void setBrand_order(Long brand_order) {
    this.brand_order = brand_order;
  }

  public java.sql.Timestamp getModified_time() {
    return modified_time;
  }

  public void setModified_time(java.sql.Timestamp modified_time) {
    this.modified_time = modified_time;
  }
}
