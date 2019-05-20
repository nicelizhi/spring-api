package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_sns", schema = "SIMULATE")
public class YpcSns {
  @Id
  @Column(name = "user_id")
  private long userId;
  private String openId;
  private long vendor;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public long getVendor() {
    return vendor;
  }

  public void setVendor(long vendor) {
    this.vendor = vendor;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
