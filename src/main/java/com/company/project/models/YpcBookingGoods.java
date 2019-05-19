package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_booking_goods", schema = "SIMULATE")
public class YpcBookingGoods {

  private long recId;
  private long userId;
  private String email;
  private String linkMan;
  private String tel;
  private long goodsId;
  private String goodsDesc;
  private long goodsNumber;
  private long bookingTime;
  private long isDispose;
  private String disposeUser;
  private long disposeTime;
  private String disposeNote;


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


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getLinkMan() {
    return linkMan;
  }

  public void setLinkMan(String linkMan) {
    this.linkMan = linkMan;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsDesc() {
    return goodsDesc;
  }

  public void setGoodsDesc(String goodsDesc) {
    this.goodsDesc = goodsDesc;
  }


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public long getBookingTime() {
    return bookingTime;
  }

  public void setBookingTime(long bookingTime) {
    this.bookingTime = bookingTime;
  }


  public long getIsDispose() {
    return isDispose;
  }

  public void setIsDispose(long isDispose) {
    this.isDispose = isDispose;
  }


  public String getDisposeUser() {
    return disposeUser;
  }

  public void setDisposeUser(String disposeUser) {
    this.disposeUser = disposeUser;
  }


  public long getDisposeTime() {
    return disposeTime;
  }

  public void setDisposeTime(long disposeTime) {
    this.disposeTime = disposeTime;
  }


  public String getDisposeNote() {
    return disposeNote;
  }

  public void setDisposeNote(String disposeNote) {
    this.disposeNote = disposeNote;
  }

}
