package com.company.project.models;

import javax.persistence.*;


@Entity
@Table (name="ypc_account_other_log", schema="SIMULATE")
public class YpcAccountOtherLog {

  @Id
  @Column(name = "user_id")
  private long userId;
  private long orderId;
  private String orderSn;
  private double money;
  private String payType;
  private String payTime;
  private String changeDesc;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }


  public String getPayTime() {
    return payTime;
  }

  public void setPayTime(String payTime) {
    this.payTime = payTime;
  }


  public String getChangeDesc() {
    return changeDesc;
  }

  public void setChangeDesc(String changeDesc) {
    this.changeDesc = changeDesc;
  }

}
