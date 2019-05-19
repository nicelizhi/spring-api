package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "ypc_cart", schema = "SIMULATE")
public class YpcCart {

  private long recId;
  private long userId;
  private String sessionId;
  private long goodsId;
  private String goodsSn;
  private long productId;
  private String goodsName;
  private double marketPrice;
  private double goodsPrice;
  private long goodsNumber;
  private String goodsAttr;
  private long isReal;
  private String extensionCode;
  private long parentId;
  private long recType;
  private long isGift;
  private long isShipping;
  private long canHandsel;
  private String goodsAttrId;


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


  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
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


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
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


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public String getGoodsAttr() {
    return goodsAttr;
  }

  public void setGoodsAttr(String goodsAttr) {
    this.goodsAttr = goodsAttr;
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


  public long getRecType() {
    return recType;
  }

  public void setRecType(long recType) {
    this.recType = recType;
  }


  public long getIsGift() {
    return isGift;
  }

  public void setIsGift(long isGift) {
    this.isGift = isGift;
  }


  public long getIsShipping() {
    return isShipping;
  }

  public void setIsShipping(long isShipping) {
    this.isShipping = isShipping;
  }


  public long getCanHandsel() {
    return canHandsel;
  }

  public void setCanHandsel(long canHandsel) {
    this.canHandsel = canHandsel;
  }


  public String getGoodsAttrId() {
    return goodsAttrId;
  }

  public void setGoodsAttrId(String goodsAttrId) {
    this.goodsAttrId = goodsAttrId;
  }

}
