package com.company.project.models;

import javax.persistence.*;

@Entity
@Table (name = "ypc_order_goods")
public class YpcOrderGoods {

  @Id
  @Column(name = "rec_id")
  @GeneratedValue (strategy=GenerationType.AUTO)
  private long recId;
  @Column (name = "order_id")
  private long orderId;
  @Column(name = "goods_id")
  private long goodsId;
  @Column (name = "goods_name")
  private String goodsName;
  @Column (name = "goods_sn")
  private String goodsSn;
  @Column (name = "product_id")
  private long productId;
  @Column (name = "goods_number")
  private long goodsNumber;
  @Column (name = "market_price")
  private double marketPrice;
  @Column (name = "goods_price")
  private double goodsPrice;
  @Column (name = "discount_fee")
  private double discountFee;
  private String goodsAttr;
  private long sendNumber;
  private long isReal;
  @Column (name = "extension_code")
  private String extensionCode;
  @Column (name = "parent_id")
  private long parentId;

  private long isGift;
  private String goodsAttrId;


  public long getRecId() {
    return recId;
  }

  public void setRecId(long recId) {
    this.recId = recId;
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


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getGoodsSn() {
    return goodsSn;
  }

  public void setGoodsSn(String goodsSn) {
    this.goodsSn = goodsSn;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public double getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public double getGoodsPrice() {
    return goodsPrice;
  }

  public void setGoodsPrice(double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }


  public double getDiscountFee() {
    return discountFee;
  }

  public void setDiscountFee(double discountFee) {
    this.discountFee = discountFee;
  }


  public String getGoodsAttr() {
    return goodsAttr;
  }

  public void setGoodsAttr(String goodsAttr) {
    this.goodsAttr = goodsAttr;
  }


  public long getSendNumber() {
    return sendNumber;
  }

  public void setSendNumber(long sendNumber) {
    this.sendNumber = sendNumber;
  }


  public long getIsReal() {
    return isReal;
  }

  public void setIsReal(long isReal) {
    this.isReal = isReal;
  }


  public String getExtensionCode() {
    return extensionCode;
  }

  public void setExtensionCode(String extensionCode) {
    this.extensionCode = extensionCode;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getIsGift() {
    return isGift;
  }

  public void setIsGift(long isGift) {
    this.isGift = isGift;
  }


  public String getGoodsAttrId() {
    return goodsAttrId;
  }

  public void setGoodsAttrId(String goodsAttrId) {
    this.goodsAttrId = goodsAttrId;
  }

}
