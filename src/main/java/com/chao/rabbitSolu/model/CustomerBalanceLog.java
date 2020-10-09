package com.chao.rabbitSolu.model;
import lombok.*;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerBalanceLog {
  private Long balance_id;
  private Long customer_id;
  private Long source;
  private Long source_sn;
  private java.sql.Timestamp create_time;
  private Double amount;

  public Long getBalance_id() {
    return balance_id;
  }

  public void setBalance_id(Long balance_id) {
    this.balance_id = balance_id;
  }

  public Long getCustomer_id() {
    return customer_id;
  }

  public void setCustomer_id(Long customer_id) {
    this.customer_id = customer_id;
  }

  public Long getSource() {
    return source;
  }

  public void setSource(Long source) {
    this.source = source;
  }

  public Long getSource_sn() {
    return source_sn;
  }

  public void setSource_sn(Long source_sn) {
    this.source_sn = source_sn;
  }

  public java.sql.Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}
