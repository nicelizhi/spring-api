package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_admin_log", schema = "SIMULATE")
public class YpcAdminLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "log_id")
    private long logId;
  private long logTime;
  private long userId;
  private String logInfo;
  private String ipAddress;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getLogTime() {
    return logTime;
  }

  public void setLogTime(long logTime) {
    this.logTime = logTime;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getLogInfo() {
    return logInfo;
  }

  public void setLogInfo(String logInfo) {
    this.logInfo = logInfo;
  }


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

}
