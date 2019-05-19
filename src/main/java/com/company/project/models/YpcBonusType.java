package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "ypc_bonus_type", schema = "SIMULATE")
public class YpcBonusType {

  private long typeId;
  private String typeName;
  private double typeMoney;
  private long sendType;
  private double minAmount;
  private double maxAmount;
  private long sendStartDate;
  private long sendEndDate;
  private long useStartDate;
  private long useEndDate;
  private double minGoodsAmount;


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  public double getTypeMoney() {
    return typeMoney;
  }

  public void setTypeMoney(double typeMoney) {
    this.typeMoney = typeMoney;
  }


  public long getSendType() {
    return sendType;
  }

  public void setSendType(long sendType) {
    this.sendType = sendType;
  }


  public double getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(double minAmount) {
    this.minAmount = minAmount;
  }


  public double getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(double maxAmount) {
    this.maxAmount = maxAmount;
  }


  public long getSendStartDate() {
    return sendStartDate;
  }

  public void setSendStartDate(long sendStartDate) {
    this.sendStartDate = sendStartDate;
  }


  public long getSendEndDate() {
    return sendEndDate;
  }

  public void setSendEndDate(long sendEndDate) {
    this.sendEndDate = sendEndDate;
  }


  public long getUseStartDate() {
    return useStartDate;
  }

  public void setUseStartDate(long useStartDate) {
    this.useStartDate = useStartDate;
  }


  public long getUseEndDate() {
    return useEndDate;
  }

  public void setUseEndDate(long useEndDate) {
    this.useEndDate = useEndDate;
  }


  public double getMinGoodsAmount() {
    return minGoodsAmount;
  }

  public void setMinGoodsAmount(double minGoodsAmount) {
    this.minGoodsAmount = minGoodsAmount;
  }

}
