package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcMemberPrice {

  private long priceId;
  private long goodsId;
  private long userRank;
  private double userPrice;


  public long getPriceId() {
    return priceId;
  }

  public void setPriceId(long priceId) {
    this.priceId = priceId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getUserRank() {
    return userRank;
  }

  public void setUserRank(long userRank) {
    this.userRank = userRank;
  }


  public double getUserPrice() {
    return userPrice;
  }

  public void setUserPrice(double userPrice) {
    this.userPrice = userPrice;
  }

}
