package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_order_action", schema = "SIMULATE")
public class YpcOrderAction {

  private long actionId;
  private long orderId;
  private String actionUser;
  private long orderStatus;
  private long shippingStatus;
  private long payStatus;
  private long actionPlace;
  private String actionNote;
  private long logTime;


  public long getActionId() {
    return actionId;
  }

  public void setActionId(long actionId) {
    this.actionId = actionId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getActionUser() {
    return actionUser;
  }

  public void setActionUser(String actionUser) {
    this.actionUser = actionUser;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public long getShippingStatus() {
    return shippingStatus;
  }

  public void setShippingStatus(long shippingStatus) {
    this.shippingStatus = shippingStatus;
  }


  public long getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(long payStatus) {
    this.payStatus = payStatus;
  }


  public long getActionPlace() {
    return actionPlace;
  }

  public void setActionPlace(long actionPlace) {
    this.actionPlace = actionPlace;
  }


  public String getActionNote() {
    return actionNote;
  }

  public void setActionNote(String actionNote) {
    this.actionNote = actionNote;
  }


  public long getLogTime() {
    return logTime;
  }

  public void setLogTime(long logTime) {
    this.logTime = logTime;
  }

}
