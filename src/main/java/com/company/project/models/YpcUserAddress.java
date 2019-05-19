package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_user_address", schema = "SIMULATE")
public class YpcUserAddress {

  private long addressId;
  private String addressName;
  private long userId;
  private String consignee;
  private String email;
  private long country;
  private long province;
  private long city;
  private long district;
  private String address;
  private String zipcode;
  private String tel;
  private String mobile;
  private String signBuilding;
  private String bestTime;


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public String getAddressName() {
    return addressName;
  }

  public void setAddressName(String addressName) {
    this.addressName = addressName;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getCountry() {
    return country;
  }

  public void setCountry(long country) {
    this.country = country;
  }


  public long getProvince() {
    return province;
  }

  public void setProvince(long province) {
    this.province = province;
  }


  public long getCity() {
    return city;
  }

  public void setCity(long city) {
    this.city = city;
  }


  public long getDistrict() {
    return district;
  }

  public void setDistrict(long district) {
    this.district = district;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getSignBuilding() {
    return signBuilding;
  }

  public void setSignBuilding(String signBuilding) {
    this.signBuilding = signBuilding;
  }


  public String getBestTime() {
    return bestTime;
  }

  public void setBestTime(String bestTime) {
    this.bestTime = bestTime;
  }

}
