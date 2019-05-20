package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_exchange_goods", schema = "SIMULATE")
public class YpcExchangeGoods {

    @Id
    @Column(name = "goods_id")
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
