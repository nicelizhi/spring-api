package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_delivery_order", schema = "SIMULATE")
public class YpcDeliveryOrder {

  private long deliveryId;
  private String deliverySn;
  private String orderSn;
  private long orderId;
  private String invoiceNo;
  private long addTime;
  private long shippingId;
  private String shippingName;
  private long userId;
  private String actionUser;
  private String consignee;
  private String address;
  private long country;
  private long province;
  private long city;
  private long district;
  private String signBuilding;
  private String email;
  private String zipcode;
  private String tel;
  private String mobile;
  private String bestTime;
  private String postscript;
  private String howOos;
  private double insureFee;
  private double shippingFee;
  private long updateTime;
  private long suppliersId;
  private long status;
  private long agencyId;


  public long getDeliveryId() {
    return deliveryId;
  }

  public void setDeliveryId(long deliveryId) {
    this.deliveryId = deliveryId;
  }


  public String getDeliverySn() {
    return deliverySn;
  }

  public void setDeliverySn(String deliverySn) {
    this.deliverySn = deliverySn;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getShippingId() {
    return shippingId;
  }

  public void setShippingId(long shippingId) {
    this.shippingId = shippingId;
  }


  public String getShippingName() {
    return shippingName;
  }

  public void setShippingName(String shippingName) {
    this.shippingName = shippingName;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getActionUser() {
    return actionUser;
  }

  public void setActionUser(String actionUser) {
    this.actionUser = actionUser;
  }


  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
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


  public String getSignBuilding() {
    return signBuilding;
  }

  public void setSignBuilding(String signBuilding) {
    this.signBuilding = signBuilding;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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


  public String getBestTime() {
    return bestTime;
  }

  public void setBestTime(String bestTime) {
    this.bestTime = bestTime;
  }


  public String getPostscript() {
    return postscript;
  }

  public void setPostscript(String postscript) {
    this.postscript = postscript;
  }


  public String getHowOos() {
    return howOos;
  }

  public void setHowOos(String howOos) {
    this.howOos = howOos;
  }


  public double getInsureFee() {
    return insureFee;
  }

  public void setInsureFee(double insureFee) {
    this.insureFee = insureFee;
  }


  public double getShippingFee() {
    return shippingFee;
  }

  public void setShippingFee(double shippingFee) {
    this.shippingFee = shippingFee;
  }


  public long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
  }


  public long getSuppliersId() {
    return suppliersId;
  }

  public void setSuppliersId(long suppliersId) {
    this.suppliersId = suppliersId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }

}
