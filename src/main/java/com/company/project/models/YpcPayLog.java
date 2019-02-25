package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcPayLog {

  private long logId;
  private long orderId;
  private double orderAmount;
  private long orderType;
  private long isPaid;


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


  public double getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(double orderAmount) {
    this.orderAmount = orderAmount;
  }


  public long getOrderType() {
    return orderType;
  }

  public void setOrderType(long orderType) {
    this.orderType = orderType;
  }


  public long getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(long isPaid) {
    this.isPaid = isPaid;
  }

}
