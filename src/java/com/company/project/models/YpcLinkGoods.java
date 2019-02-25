package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcLinkGoods {

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
