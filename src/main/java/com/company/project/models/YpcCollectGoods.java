package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_collect_goods", schema = "SIMULATE")
public class YpcCollectGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rec_id")
    private long recId;
  private long userId;
  private long goodsId;
  private long addTime;
  private long isAttention;


  public long getRecId() {
    return recId;
  }

  public void setRecId(long recId) {
    this.recId = recId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getIsAttention() {
    return isAttention;
  }

  public void setIsAttention(long isAttention) {
    this.isAttention = isAttention;
  }

}
