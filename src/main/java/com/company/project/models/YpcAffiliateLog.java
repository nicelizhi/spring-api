package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcAffiliateLog {

  private long logId;
  private long orderId;
  private long time;
  private long userId;
  private String userName;
  private double money;
  private long point;
  private long separateType;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public long getPoint() {
    return point;
  }

  public void setPoint(long point) {
    this.point = point;
  }


  public long getSeparateType() {
    return separateType;
  }

  public void setSeparateType(long separateType) {
    this.separateType = separateType;
  }

}
