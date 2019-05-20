package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_snatch_log", schema = "SIMULATE")
public class YpcSnatchLog {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "log_id")
  private long logId;
  private long snatchId;
  private long userId;
  private double bidPrice;
  private long bidTime;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getSnatchId() {
    return snatchId;
  }

  public void setSnatchId(long snatchId) {
    this.snatchId = snatchId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public double getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(double bidPrice) {
    this.bidPrice = bidPrice;
  }


  public long getBidTime() {
    return bidTime;
  }

  public void setBidTime(long bidTime) {
    this.bidTime = bidTime;
  }

}
