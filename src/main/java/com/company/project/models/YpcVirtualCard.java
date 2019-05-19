package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_virtual_card", schema = "SIMULATE")
public class YpcVirtualCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private long cardId;
    @Column(name = "goods_id")
    private long goodsId;
    @Column(name = "card_sn")
    private String cardSn;
    @Column(name = "card_password")
    private String cardPassword;
    @Column(name = "add_date")
    private long addDate;
    @Column(name = "end_date")
    private long endDate;
    @Column(name = "is_saled")
    private long isSaled;
    @Column(name = "order_sn")
    private String orderSn;
    @Column(name = "crc32")
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
