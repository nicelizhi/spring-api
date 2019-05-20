package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_member_price", schema = "SIMULATE")
public class YpcMemberPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "price_id")
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
