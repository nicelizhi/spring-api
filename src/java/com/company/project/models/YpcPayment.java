package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcPayment {

  private long payId;
  private String payCode;
  private String payName;
  private String payFee;
  private String payDesc;
  private long payOrder;
  private String payConfig;
  private long enabled;
  private long isCod;
  private long isOnline;


  public long getPayId() {
    return payId;
  }

  public void setPayId(long payId) {
    this.payId = payId;
  }


  public String getPayCode() {
    return payCode;
  }

  public void setPayCode(String payCode) {
    this.payCode = payCode;
  }


  public String getPayName() {
    return payName;
  }

  public void setPayName(String payName) {
    this.payName = payName;
  }


  public String getPayFee() {
    return payFee;
  }

  public void setPayFee(String payFee) {
    this.payFee = payFee;
  }


  public String getPayDesc() {
    return payDesc;
  }

  public void setPayDesc(String payDesc) {
    this.payDesc = payDesc;
  }


  public long getPayOrder() {
    return payOrder;
  }

  public void setPayOrder(long payOrder) {
    this.payOrder = payOrder;
  }


  public String getPayConfig() {
    return payConfig;
  }

  public void setPayConfig(String payConfig) {
    this.payConfig = payConfig;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }


  public long getIsCod() {
    return isCod;
  }

  public void setIsCod(long isCod) {
    this.isCod = isCod;
  }


  public long getIsOnline() {
    return isOnline;
  }

  public void setIsOnline(long isOnline) {
    this.isOnline = isOnline;
  }

}
