package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_wholesale", schema = "SIMULATE")
public class YpcWholesale {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "act_id")
  private long actId;
  @Column(name = "goods_id")
  private long goodsId;
  @Column(name = "goods_name")
  private String goodsName;
  @Column(name = "rank_ids")
  private String rankIds;

  @Column(name = "prices")
  private String prices;

  @Column(name = "enabled")
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
