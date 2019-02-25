package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcSnatchLog {

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
