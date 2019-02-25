package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcUserBonus {

  private long bonusId;
  private long bonusTypeId;
  private long bonusSn;
  private long userId;
  private long usedTime;
  private long orderId;
  private long emailed;


  public long getBonusId() {
    return bonusId;
  }

  public void setBonusId(long bonusId) {
    this.bonusId = bonusId;
  }


  public long getBonusTypeId() {
    return bonusTypeId;
  }

  public void setBonusTypeId(long bonusTypeId) {
    this.bonusTypeId = bonusTypeId;
  }


  public long getBonusSn() {
    return bonusSn;
  }

  public void setBonusSn(long bonusSn) {
    this.bonusSn = bonusSn;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getUsedTime() {
    return usedTime;
  }

  public void setUsedTime(long usedTime) {
    this.usedTime = usedTime;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getEmailed() {
    return emailed;
  }

  public void setEmailed(long emailed) {
    this.emailed = emailed;
  }

}
