package com.company.project.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table (name = "ypc_order_goods", schema="SIMULATE")
public class YpcOrderGoods {

  @Id
  @GeneratedValue (strategy=GenerationType.AUTO)
  @Column(name = "rec_id")
  private Integer recId;
  @Column (name = "order_id")
  private Integer orderId;
  @Column(name = "goods_id")
  private Integer goodsId;
  @Column (name = "goods_name")
  private String goodsName;
  @Column (name = "goods_sn")
  private String goodsSn;
  @Column (name = "product_id")
  private Integer productId;
  @Column (name = "goods_number")
  private Integer goodsNumber;
  @Column (name = "market_price")
  private double marketPrice;
  @Column (name = "goods_price")
  private double goodsPrice;
  @Column (name = "discount_fee")
  private double discountFee;
  @Column (name = "goods_attr")
  private String goodsAttr;
  @Column (name = "send_number")
  private Integer sendNumber;
  @Column (name = "is_real")
  private Integer isReal;
  @Column (name = "extension_code")
  private String extensionCode;
  @Column (name = "parent_id")
  private Integer parentId;
  @Column (name = "is_gift")
  private Integer isGift;
  @Column (name = "goods_attr_id")
  private String goodsAttrId;

  @ManyToOne
  @JoinColumn(name = "order_id", nullable = false)
  private YpcOrderInfo ypcOrderInfo;


  public Integer getRecId() {
    return recId;
  }

  public void setRecId(Integer recId) {
    this.recId = recId;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public Integer getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(Integer goodsId) {
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


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(Integer goodsNumber) {
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

  public void setSendNumber(Integer sendNumber) {
    this.sendNumber = sendNumber;
  }


  public Integer getIsReal() {
    return isReal;
  }

  public void setIsReal(Integer isReal) {
    this.isReal = isReal;
  }


  public String getExtensionCode() {
    return extensionCode;
  }

  public void setExtensionCode(String extensionCode) {
    this.extensionCode = extensionCode;
  }


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }


  public Integer getIsGift() {
    return isGift;
  }

  public void setIsGift(Integer isGift) {
    this.isGift = isGift;
  }


  public String getGoodsAttrId() {
    return goodsAttrId;
  }

  public void setGoodsAttrId(String goodsAttrId) {
    this.goodsAttrId = goodsAttrId;
  }

}
