package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_group_goods", schema = "SIMULATE")
public class YpcGroupGoods {

    @Id
    @Column(name = "parent_id")
    private long parentId;
  private long goodsId;
  private double goodsPrice;
  private long adminId;


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public double getGoodsPrice() {
    return goodsPrice;
  }

  public void setGoodsPrice(double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(long adminId) {
    this.adminId = adminId;
  }

}
