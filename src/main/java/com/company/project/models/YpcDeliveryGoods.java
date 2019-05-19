package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_delivery_goods", schema = "SIMULATE")
public class YpcDeliveryGoods {

  private long recId;
  private long deliveryId;
  private long goodsId;
  private long productId;
  private String productSn;
  private String goodsName;
  private String brandName;
  private String goodsSn;
  private long isReal;
  private String extensionCode;
  private long parentId;
  private long sendNumber;
  private String goodsAttr;


  public long getRecId() {
    return recId;
  }

  public void setRecId(long recId) {
    this.recId = recId;
  }


  public long getDeliveryId() {
    return deliveryId;
  }

  public void setDeliveryId(long deliveryId) {
    this.deliveryId = deliveryId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public String getProductSn() {
    return productSn;
  }

  public void setProductSn(String productSn) {
    this.productSn = productSn;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public String getGoodsSn() {
    return goodsSn;
  }

  public void setGoodsSn(String goodsSn) {
    this.goodsSn = goodsSn;
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


  public long getSendNumber() {
    return sendNumber;
  }

  public void setSendNumber(long sendNumber) {
    this.sendNumber = sendNumber;
  }


  public String getGoodsAttr() {
    return goodsAttr;
  }

  public void setGoodsAttr(String goodsAttr) {
    this.goodsAttr = goodsAttr;
  }

}
