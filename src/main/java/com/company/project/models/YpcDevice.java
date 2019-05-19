package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_device", schema = "SIMULATE")
public class YpcDevice {

    @Id
    @Column(name = "user_id")
    private long userId;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "device_type")
    private String deviceType;
    @Column(name = "platform_type")
    private String platformType;
    @Column(name = "status")
    private long status;
    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;
    @Column(name = "updated_at")
    private java.sql.Timestamp updatedAt;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public String getPlatformType() {
    return platformType;
  }

  public void setPlatformType(String platformType) {
    this.platformType = platformType;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
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
