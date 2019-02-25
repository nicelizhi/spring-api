package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcExchangeGoods {

  private long goodsId;
  private long exchangeIntegral;
  private long isExchange;
  private long isHot;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getExchangeIntegral() {
    return exchangeIntegral;
  }

  public void setExchangeIntegral(long exchangeIntegral) {
    this.exchangeIntegral = exchangeIntegral;
  }


  public long getIsExchange() {
    return isExchange;
  }

  public void setIsExchange(long isExchange) {
    this.isExchange = isExchange;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }

}
