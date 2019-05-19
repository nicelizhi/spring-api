package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_goods_attr", schema = "SIMULATE")
public class YpcGoodsAttr {

  private long goodsAttrId;
  private long goodsId;
  private long attrId;
  private String attrValue;
  private String attrPrice;


  public long getGoodsAttrId() {
    return goodsAttrId;
  }

  public void setGoodsAttrId(long goodsAttrId) {
    this.goodsAttrId = goodsAttrId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getAttrId() {
    return attrId;
  }

  public void setAttrId(long attrId) {
    this.attrId = attrId;
  }


  public String getAttrValue() {
    return attrValue;
  }

  public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
  }


  public String getAttrPrice() {
    return attrPrice;
  }

  public void setAttrPrice(String attrPrice) {
    this.attrPrice = attrPrice;
  }

}
