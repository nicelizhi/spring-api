package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_favourable_activity", schema = "SIMULATE")
public class YpcFavourableActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "act_id")
    private long actId;
  private String actName;
  private long startTime;
  private long endTime;
  private String userRank;
  private long actRange;
  private String actRangeExt;
  private double minAmount;
  private double maxAmount;
  private long actType;
  private double actTypeExt;
  private String gift;
  private long sortOrder;


  public long getActId() {
    return actId;
  }

  public void setActId(long actId) {
    this.actId = actId;
  }


  public String getActName() {
    return actName;
  }

  public void setActName(String actName) {
    this.actName = actName;
  }


  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public String getUserRank() {
    return userRank;
  }

  public void setUserRank(String userRank) {
    this.userRank = userRank;
  }


  public long getActRange() {
    return actRange;
  }

  public void setActRange(long actRange) {
    this.actRange = actRange;
  }


  public String getActRangeExt() {
    return actRangeExt;
  }

  public void setActRangeExt(String actRangeExt) {
    this.actRangeExt = actRangeExt;
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


  public long getActType() {
    return actType;
  }

  public void setActType(long actType) {
    this.actType = actType;
  }


  public double getActTypeExt() {
    return actTypeExt;
  }

  public void setActTypeExt(double actTypeExt) {
    this.actTypeExt = actTypeExt;
  }


  public String getGift() {
    return gift;
  }

  public void setGift(String gift) {
    this.gift = gift;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }

}
