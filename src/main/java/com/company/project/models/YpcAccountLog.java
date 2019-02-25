package com.company.project.models;

import javax.persistence.*;
import java.util.Date;


@Entity // This tells Hibernate to make a table out of this class
@Table(name="ypc_account_log", schema="SIMULATE")
public class YpcAccountLog {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "log_id")
  private long logId;
  private long userId;
  private double userMoney;
  private double frozenMoney;
  private long rankPoints;
  private long payPoints;
  private long changeTime;
  private String changeDesc;
  private long changeType;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public double getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(double userMoney) {
    this.userMoney = userMoney;
  }


  public double getFrozenMoney() {
    return frozenMoney;
  }

  public void setFrozenMoney(double frozenMoney) {
    this.frozenMoney = frozenMoney;
  }


  public long getRankPoints() {
    return rankPoints;
  }

  public void setRankPoints(long rankPoints) {
    this.rankPoints = rankPoints;
  }


  public long getPayPoints() {
    return payPoints;
  }

  public void setPayPoints(long payPoints) {
    this.payPoints = payPoints;
  }


  public long getChangeTime() {
    return changeTime;
  }

  public void setChangeTime(long changeTime) {
    this.changeTime = changeTime;
  }


  public String getChangeDesc() {
    return changeDesc;
  }

  public void setChangeDesc(String changeDesc) {
    this.changeDesc = changeDesc;
  }


  public long getChangeType() {
    return changeType;
  }

  public void setChangeType(long changeType) {
    this.changeType = changeType;
  }

}
