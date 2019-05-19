package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "ypc_card", schema = "SIMULATE")
public class YpcCard {

  private long cardId;
  private String cardName;
  private String cardImg;
  private double cardFee;
  private double freeMoney;
  private String cardDesc;


  public long getCardId() {
    return cardId;
  }

  public void setCardId(long cardId) {
    this.cardId = cardId;
  }


  public String getCardName() {
    return cardName;
  }

  public void setCardName(String cardName) {
    this.cardName = cardName;
  }


  public String getCardImg() {
    return cardImg;
  }

  public void setCardImg(String cardImg) {
    this.cardImg = cardImg;
  }


  public double getCardFee() {
    return cardFee;
  }

  public void setCardFee(double cardFee) {
    this.cardFee = cardFee;
  }


  public double getFreeMoney() {
    return freeMoney;
  }

  public void setFreeMoney(double freeMoney) {
    this.freeMoney = freeMoney;
  }


  public String getCardDesc() {
    return cardDesc;
  }

  public void setCardDesc(String cardDesc) {
    this.cardDesc = cardDesc;
  }

}
