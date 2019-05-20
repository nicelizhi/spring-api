package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_goods_attr", schema = "SIMULATE")
public class YpcGoodsAttr {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goods_attr_id")
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
