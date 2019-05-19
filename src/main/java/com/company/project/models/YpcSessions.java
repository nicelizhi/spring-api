package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_sessions", schema = "SIMULATE")
public class YpcSessions {

  private String sesskey;
  private long expiry;
  private long userid;
  private long adminid;
  private String ip;
  private String userName;
  private long userRank;
  private double discount;
  private String email;
  private String data;


  public String getSesskey() {
    return sesskey;
  }

  public void setSesskey(String sesskey) {
    this.sesskey = sesskey;
  }


  public long getExpiry() {
    return expiry;
  }

  public void setExpiry(long expiry) {
    this.expiry = expiry;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getAdminid() {
    return adminid;
  }

  public void setAdminid(long adminid) {
    this.adminid = adminid;
  }


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getUserRank() {
    return userRank;
  }

  public void setUserRank(long userRank) {
    this.userRank = userRank;
  }


  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

}
