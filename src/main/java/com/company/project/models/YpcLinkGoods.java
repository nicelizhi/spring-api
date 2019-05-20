package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_link_goods", schema = "SIMULATE")
public class YpcLinkGoods {

    @Id
    @Column(name = "goods_id")
    private long goodsId;
  private long linkGoodsId;
  private long isDouble;
  private long adminId;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getLinkGoodsId() {
    return linkGoodsId;
  }

  public void setLinkGoodsId(long linkGoodsId) {
    this.linkGoodsId = linkGoodsId;
  }


  public long getIsDouble() {
    return isDouble;
  }

  public void setIsDouble(long isDouble) {
    this.isDouble = isDouble;
  }


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(long adminId) {
    this.adminId = adminId;
  }

}
