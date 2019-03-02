package com.company.project.models;

import javax.persistence.*;

@Entity
@Table (name="ypc_order_info" , schema="SIMULATE")
public class YpcOrderInfo {

  @Id
  @Column(name = "order_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long orderId;
  @Column(name = "order_sn")
  private String orderSn;
  @Column(name = "user_id")
  private long userId;
  @Column(name = "order_status")
  private long orderStatus;
  @Column(name = "shipping_status")
  private long shippingStatus;
  @Column(name = "pay_status")
  private long payStatus;
  private String consignee;
  private long country;
  private long province;
  private long city;
  private long district;
  private String address;
  private String zipcode;
  private String tel;
  private String mobile;
  private String email;
  private String bestTime;
  private String signBuilding;
  private String postscript;
  private long shippingId;
  private String shippingName;
  @Column(name = "pay_id")
  private long payId;
  private String payName;
  private String howOos;
  private String howSurplus;
  private String packName;
  private String cardName;
  private String cardMessage;
  private String invPayee;
  private String invContent;
  private double goodsAmount;
  private double shippingFee;
  private double insureFee;
  private double payFee;
  private double packFee;
  private double cardFee;
  private double goodsDiscountFee;
  private double moneyPaid;
  private double surplus;
  private long integral;
  private double integralMoney;
  private double bonus;
  private double orderAmount;
  private long fromAd;
  private String referer;
  private long addTime;
  private long confirmTime;
  private long payTime;
  private long shippingTime;
  private long packId;
  private long cardId;
  private long bonusId;
  private String invoiceNo;
  private String extensionCode;
  private long extensionId;
  private String toBuyer;
  private String payNote;
  private long agencyId;
  private String invType;
  private double tax;
  private long isSeparate;
  private long parentId;
  private double discount;
  private String callbackStatus;
  private long lastmodify;

  private YpcOrderGoodsRepository ypcOrderGoodsRepository;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public long getShippingStatus() {
    return shippingStatus;
  }

  public void setShippingStatus(long shippingStatus) {
    this.shippingStatus = shippingStatus;
  }


  public long getPayStatus() {
    return payStatus;
  }

  public void setPayStatus(long payStatus) {
    this.payStatus = payStatus;
  }


  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
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


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getBestTime() {
    return bestTime;
  }

  public void setBestTime(String bestTime) {
    this.bestTime = bestTime;
  }


  public String getSignBuilding() {
    return signBuilding;
  }

  public void setSignBuilding(String signBuilding) {
    this.signBuilding = signBuilding;
  }


  public String getPostscript() {
    return postscript;
  }

  public void setPostscript(String postscript) {
    this.postscript = postscript;
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


  public long getPayId() {
    return payId;
  }

  public void setPayId(long payId) {
    this.payId = payId;
  }


  public String getPayName() {
    return payName;
  }

  public void setPayName(String payName) {
    this.payName = payName;
  }


  public String getHowOos() {
    return howOos;
  }

  public void setHowOos(String howOos) {
    this.howOos = howOos;
  }


  public String getHowSurplus() {
    return howSurplus;
  }

  public void setHowSurplus(String howSurplus) {
    this.howSurplus = howSurplus;
  }


  public String getPackName() {
    return packName;
  }

  public void setPackName(String packName) {
    this.packName = packName;
  }


  public String getCardName() {
    return cardName;
  }

  public void setCardName(String cardName) {
    this.cardName = cardName;
  }


  public String getCardMessage() {
    return cardMessage;
  }

  public void setCardMessage(String cardMessage) {
    this.cardMessage = cardMessage;
  }


  public String getInvPayee() {
    return invPayee;
  }

  public void setInvPayee(String invPayee) {
    this.invPayee = invPayee;
  }


  public String getInvContent() {
    return invContent;
  }

  public void setInvContent(String invContent) {
    this.invContent = invContent;
  }


  public double getGoodsAmount() {
    return goodsAmount;
  }

  public void setGoodsAmount(double goodsAmount) {
    this.goodsAmount = goodsAmount;
  }


  public double getShippingFee() {
    return shippingFee;
  }

  public void setShippingFee(double shippingFee) {
    this.shippingFee = shippingFee;
  }


  public double getInsureFee() {
    return insureFee;
  }

  public void setInsureFee(double insureFee) {
    this.insureFee = insureFee;
  }


  public double getPayFee() {
    return payFee;
  }

  public void setPayFee(double payFee) {
    this.payFee = payFee;
  }


  public double getPackFee() {
    return packFee;
  }

  public void setPackFee(double packFee) {
    this.packFee = packFee;
  }


  public double getCardFee() {
    return cardFee;
  }

  public void setCardFee(double cardFee) {
    this.cardFee = cardFee;
  }


  public double getGoodsDiscountFee() {
    return goodsDiscountFee;
  }

  public void setGoodsDiscountFee(double goodsDiscountFee) {
    this.goodsDiscountFee = goodsDiscountFee;
  }


  public double getMoneyPaid() {
    return moneyPaid;
  }

  public void setMoneyPaid(double moneyPaid) {
    this.moneyPaid = moneyPaid;
  }


  public double getSurplus() {
    return surplus;
  }

  public void setSurplus(double surplus) {
    this.surplus = surplus;
  }


  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }


  public double getIntegralMoney() {
    return integralMoney;
  }

  public void setIntegralMoney(double integralMoney) {
    this.integralMoney = integralMoney;
  }


  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }


  public double getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(double orderAmount) {
    this.orderAmount = orderAmount;
  }


  public long getFromAd() {
    return fromAd;
  }

  public void setFromAd(long fromAd) {
    this.fromAd = fromAd;
  }


  public String getReferer() {
    return referer;
  }

  public void setReferer(String referer) {
    this.referer = referer;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getConfirmTime() {
    return confirmTime;
  }

  public void setConfirmTime(long confirmTime) {
    this.confirmTime = confirmTime;
  }


  public long getPayTime() {
    return payTime;
  }

  public void setPayTime(long payTime) {
    this.payTime = payTime;
  }


  public long getShippingTime() {
    return shippingTime;
  }

  public void setShippingTime(long shippingTime) {
    this.shippingTime = shippingTime;
  }


  public long getPackId() {
    return packId;
  }

  public void setPackId(long packId) {
    this.packId = packId;
  }


  public long getCardId() {
    return cardId;
  }

  public void setCardId(long cardId) {
    this.cardId = cardId;
  }


  public long getBonusId() {
    return bonusId;
  }

  public void setBonusId(long bonusId) {
    this.bonusId = bonusId;
  }


  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public String getExtensionCode() {
    return extensionCode;
  }

  public void setExtensionCode(String extensionCode) {
    this.extensionCode = extensionCode;
  }


  public long getExtensionId() {
    return extensionId;
  }

  public void setExtensionId(long extensionId) {
    this.extensionId = extensionId;
  }


  public String getToBuyer() {
    return toBuyer;
  }

  public void setToBuyer(String toBuyer) {
    this.toBuyer = toBuyer;
  }


  public String getPayNote() {
    return payNote;
  }

  public void setPayNote(String payNote) {
    this.payNote = payNote;
  }


  public long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }


  public String getInvType() {
    return invType;
  }

  public void setInvType(String invType) {
    this.invType = invType;
  }


  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }


  public long getIsSeparate() {
    return isSeparate;
  }

  public void setIsSeparate(long isSeparate) {
    this.isSeparate = isSeparate;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }


  public String getCallbackStatus() {
    return callbackStatus;
  }

  public void setCallbackStatus(String callbackStatus) {
    this.callbackStatus = callbackStatus;
  }


  public long getLastmodify() {
    return lastmodify;
  }

  public void setLastmodify(long lastmodify) {
    this.lastmodify = lastmodify;
  }
}
