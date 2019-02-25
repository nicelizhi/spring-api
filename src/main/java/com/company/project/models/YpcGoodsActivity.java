package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcGoodsActivity {

  private long actId;
  private String actName;
  private String actDesc;
  private long actType;
  private long goodsId;
  private long productId;
  private String goodsName;
  private long startTime;
  private long endTime;
  private long isFinished;
  private String extInfo;


  public long getActId() {
    return actId;
  }

  public void setActId(long actId) {
    this.actId = actId;
  }


  public String getActName() {
    return actName;
  }

  public void setActName(String actName) {
    this.actName = actName;
  }


  public String getActDesc() {
    return actDesc;
  }

  public void setActDesc(String actDesc) {
    this.actDesc = actDesc;
  }


  public long getActType() {
    return actType;
  }

  public void setActType(long actType) {
    this.actType = actType;
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


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public long getIsFinished() {
    return isFinished;
  }

  public void setIsFinished(long isFinished) {
    this.isFinished = isFinished;
  }


  public String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }

}
