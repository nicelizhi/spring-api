package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_affiliate_log", schema = "SIMULATE")
public class YpcAffiliateLog {

    @Id
    @Column(name = "log_id")
    private long logId;
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "time")
    private long time;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "money")
    private double money;
    @Column(name = "point")
    private long point;
    @Column(name = "separate_type")
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
