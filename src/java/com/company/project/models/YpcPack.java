package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcPack {

  private long packId;
  private String packName;
  private String packImg;
  private double packFee;
  private long freeMoney;
  private String packDesc;


  public long getPackId() {
    return packId;
  }

  public void setPackId(long packId) {
    this.packId = packId;
  }


  public String getPackName() {
    return packName;
  }

  public void setPackName(String packName) {
    this.packName = packName;
  }


  public String getPackImg() {
    return packImg;
  }

  public void setPackImg(String packImg) {
    this.packImg = packImg;
  }


  public double getPackFee() {
    return packFee;
  }

  public void setPackFee(double packFee) {
    this.packFee = packFee;
  }


  public long getFreeMoney() {
    return freeMoney;
  }

  public void setFreeMoney(long freeMoney) {
    this.freeMoney = freeMoney;
  }


  public String getPackDesc() {
    return packDesc;
  }

  public void setPackDesc(String packDesc) {
    this.packDesc = packDesc;
  }

}
