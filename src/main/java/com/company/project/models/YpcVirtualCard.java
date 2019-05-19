package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_virtual_card", schema = "SIMULATE")
public class YpcVirtualCard {

  private long cardId;
  private long goodsId;
  private String cardSn;
  private String cardPassword;
  private long addDate;
  private long endDate;
  private long isSaled;
  private String orderSn;
  private String crc32;


  public long getCardId() {
    return cardId;
  }

  public void setCardId(long cardId) {
    this.cardId = cardId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getCardSn() {
    return cardSn;
  }

  public void setCardSn(String cardSn) {
    this.cardSn = cardSn;
  }


  public String getCardPassword() {
    return cardPassword;
  }

  public void setCardPassword(String cardPassword) {
    this.cardPassword = cardPassword;
  }


  public long getAddDate() {
    return addDate;
  }

  public void setAddDate(long addDate) {
    this.addDate = addDate;
  }


  public long getEndDate() {
    return endDate;
  }

  public void setEndDate(long endDate) {
    this.endDate = endDate;
  }


  public long getIsSaled() {
    return isSaled;
  }

  public void setIsSaled(long isSaled) {
    this.isSaled = isSaled;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public String getCrc32() {
    return crc32;
  }

  public void setCrc32(String crc32) {
    this.crc32 = crc32;
  }

}
