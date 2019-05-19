package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_wholesale", schema = "SIMULATE")
public class YpcWholesale {

  private long actId;
  private long goodsId;
  private String goodsName;
  private String rankIds;
  private String prices;
  private long enabled;


  public long getActId() {
    return actId;
  }

  public void setActId(long actId) {
    this.actId = actId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getRankIds() {
    return rankIds;
  }

  public void setRankIds(String rankIds) {
    this.rankIds = rankIds;
  }


  public String getPrices() {
    return prices;
  }

  public void setPrices(String prices) {
    this.prices = prices;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }

}
