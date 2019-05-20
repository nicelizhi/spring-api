package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_order_review", schema = "SIMULATE")
public class YpcOrderReview {

    @Id
    @Column(name = "user_id")
    private long userId;
  private long orderId;
  private long goodsId;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }

}
