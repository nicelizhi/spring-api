package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcUserRank {

  private long rankId;
  private String rankName;
  private long minPoints;
  private long maxPoints;
  private long discount;
  private long showPrice;
  private long specialRank;


  public long getRankId() {
    return rankId;
  }

  public void setRankId(long rankId) {
    this.rankId = rankId;
  }


  public String getRankName() {
    return rankName;
  }

  public void setRankName(String rankName) {
    this.rankName = rankName;
  }


  public long getMinPoints() {
    return minPoints;
  }

  public void setMinPoints(long minPoints) {
    this.minPoints = minPoints;
  }


  public long getMaxPoints() {
    return maxPoints;
  }

  public void setMaxPoints(long maxPoints) {
    this.maxPoints = maxPoints;
  }


  public long getDiscount() {
    return discount;
  }

  public void setDiscount(long discount) {
    this.discount = discount;
  }


  public long getShowPrice() {
    return showPrice;
  }

  public void setShowPrice(long showPrice) {
    this.showPrice = showPrice;
  }


  public long getSpecialRank() {
    return specialRank;
  }

  public void setSpecialRank(long specialRank) {
    this.specialRank = specialRank;
  }

}
