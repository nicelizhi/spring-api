package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_goods", schema = "SIMULATE")
public class YpcGoods {

  private long goodsId;
  private long catId;
  private String goodsSn;
  private String goodsName;
  private String goodsNameStyle;
  private long clickCount;
  private long brandId;
  private String providerName;
  private long goodsNumber;
  private double goodsWeight;
  private double marketPrice;
  private long virtualSales;
  private double shopPrice;
  private double promotePrice;
  private long promoteStartDate;
  private long promoteEndDate;
  private long warnNumber;
  private String keywords;
  private String goodsBrief;
  private String goodsDesc;
  private String goodsThumb;
  private String goodsImg;
  private String originalImg;
  private long isReal;
  private String extensionCode;
  private long isOnSale;
  private long isAloneSale;
  private long isShipping;
  private long integral;
  private long addTime;
  private long sortOrder;
  private long isDelete;
  private long isBest;
  private long isNew;
  private long isHot;
  private long isPromote;
  private long bonusTypeId;
  private long lastUpdate;
  private long goodsType;
  private String sellerNote;
  private long giveIntegral;
  private long rankIntegral;
  private long suppliersId;
  private long isCheck;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getCatId() {
    return catId;
  }

  public void setCatId(long catId) {
    this.catId = catId;
  }


  public String getGoodsSn() {
    return goodsSn;
  }

  public void setGoodsSn(String goodsSn) {
    this.goodsSn = goodsSn;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getGoodsNameStyle() {
    return goodsNameStyle;
  }

  public void setGoodsNameStyle(String goodsNameStyle) {
    this.goodsNameStyle = goodsNameStyle;
  }


  public long getClickCount() {
    return clickCount;
  }

  public void setClickCount(long clickCount) {
    this.clickCount = clickCount;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public double getGoodsWeight() {
    return goodsWeight;
  }

  public void setGoodsWeight(double goodsWeight) {
    this.goodsWeight = goodsWeight;
  }


  public double getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(double marketPrice) {
    this.marketPrice = marketPrice;
  }


  public long getVirtualSales() {
    return virtualSales;
  }

  public void setVirtualSales(long virtualSales) {
    this.virtualSales = virtualSales;
  }


  public double getShopPrice() {
    return shopPrice;
  }

  public void setShopPrice(double shopPrice) {
    this.shopPrice = shopPrice;
  }


  public double getPromotePrice() {
    return promotePrice;
  }

  public void setPromotePrice(double promotePrice) {
    this.promotePrice = promotePrice;
  }


  public long getPromoteStartDate() {
    return promoteStartDate;
  }

  public void setPromoteStartDate(long promoteStartDate) {
    this.promoteStartDate = promoteStartDate;
  }


  public long getPromoteEndDate() {
    return promoteEndDate;
  }

  public void setPromoteEndDate(long promoteEndDate) {
    this.promoteEndDate = promoteEndDate;
  }


  public long getWarnNumber() {
    return warnNumber;
  }

  public void setWarnNumber(long warnNumber) {
    this.warnNumber = warnNumber;
  }


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public String getGoodsBrief() {
    return goodsBrief;
  }

  public void setGoodsBrief(String goodsBrief) {
    this.goodsBrief = goodsBrief;
  }


  public String getGoodsDesc() {
    return goodsDesc;
  }

  public void setGoodsDesc(String goodsDesc) {
    this.goodsDesc = goodsDesc;
  }


  public String getGoodsThumb() {
    return goodsThumb;
  }

  public void setGoodsThumb(String goodsThumb) {
    this.goodsThumb = goodsThumb;
  }


  public String getGoodsImg() {
    return goodsImg;
  }

  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg;
  }


  public String getOriginalImg() {
    return originalImg;
  }

  public void setOriginalImg(String originalImg) {
    this.originalImg = originalImg;
  }


  public long getIsReal() {
    return isReal;
  }

  public void setIsReal(long isReal) {
    this.isReal = isReal;
  }


  public String getExtensionCode() {
    return extensionCode;
  }

  public void setExtensionCode(String extensionCode) {
    this.extensionCode = extensionCode;
  }


  public long getIsOnSale() {
    return isOnSale;
  }

  public void setIsOnSale(long isOnSale) {
    this.isOnSale = isOnSale;
  }


  public long getIsAloneSale() {
    return isAloneSale;
  }

  public void setIsAloneSale(long isAloneSale) {
    this.isAloneSale = isAloneSale;
  }


  public long getIsShipping() {
    return isShipping;
  }

  public void setIsShipping(long isShipping) {
    this.isShipping = isShipping;
  }


  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }


  public long getIsBest() {
    return isBest;
  }

  public void setIsBest(long isBest) {
    this.isBest = isBest;
  }


  public long getIsNew() {
    return isNew;
  }

  public void setIsNew(long isNew) {
    this.isNew = isNew;
  }


  public long getIsHot() {
    return isHot;
  }

  public void setIsHot(long isHot) {
    this.isHot = isHot;
  }


  public long getIsPromote() {
    return isPromote;
  }

  public void setIsPromote(long isPromote) {
    this.isPromote = isPromote;
  }


  public long getBonusTypeId() {
    return bonusTypeId;
  }

  public void setBonusTypeId(long bonusTypeId) {
    this.bonusTypeId = bonusTypeId;
  }


  public long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public long getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(long goodsType) {
    this.goodsType = goodsType;
  }


  public String getSellerNote() {
    return sellerNote;
  }

  public void setSellerNote(String sellerNote) {
    this.sellerNote = sellerNote;
  }


  public long getGiveIntegral() {
    return giveIntegral;
  }

  public void setGiveIntegral(long giveIntegral) {
    this.giveIntegral = giveIntegral;
  }


  public long getRankIntegral() {
    return rankIntegral;
  }

  public void setRankIntegral(long rankIntegral) {
    this.rankIntegral = rankIntegral;
  }


  public long getSuppliersId() {
    return suppliersId;
  }

  public void setSuppliersId(long suppliersId) {
    this.suppliersId = suppliersId;
  }


  public long getIsCheck() {
    return isCheck;
  }

  public void setIsCheck(long isCheck) {
    this.isCheck = isCheck;
  }

}
