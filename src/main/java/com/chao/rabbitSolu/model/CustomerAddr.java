package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerAddr {
  private Long customer_addr_id;
  private Long customer_id;
  private Long zip;
  private Long province;
  private Long city;
  private Long district;
  private String address;
  private Long is_default;
  private java.sql.Timestamp modified_time;

  public Long getCustomer_addr_id() {
    return customer_addr_id;
  }

  public void setCustomer_addr_id(Long customer_addr_id) {
    this.customer_addr_id = customer_addr_id;
  }

  public Long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(Long customer_id) {
    this.customer_id = customer_id;
  }

  public Long getZip() {
    return zip;
  }

  public void setZip(Long zip) {
    this.zip = zip;
  }

  public Long getProvince() {
    return province;
  }

  public void setProvince(Long province) {
    this.province = province;
  }

  public Long getCity() {
    return city;
  }

  public void setCity(Long city) {
    this.city = city;
  }

  public Long getDistrict() {
    return district;
  }

  public void setDistrict(Long district) {
    this.district = district;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Long getIs_default() {
    return is_default;
  }

  public void setIs_default(Long is_default) {
    this.is_default = is_default;
  }

  public java.sql.Timestamp getModified_time() {
    return modified_time;
  }

  public void setModified_time(java.sql.Timestamp modified_time) {
    this.modified_time = modified_time;
  }
}
