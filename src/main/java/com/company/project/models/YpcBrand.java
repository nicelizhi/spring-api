package com.company.project.models;

import javax.persistence.*;


@Entity
@Table(name = "ypc_brand", schema = "SIMULATE")
public class YpcBrand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brandid")
    private long brandId;
  private String brandName;
  private String brandLogo;
  private String brandDesc;
  private String siteUrl;
  private long sortOrder;
  private long isShow;


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public String getBrandLogo() {
    return brandLogo;
  }

  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public String getBrandDesc() {
    return brandDesc;
  }

  public void setBrandDesc(String brandDesc) {
    this.brandDesc = brandDesc;
  }


  public String getSiteUrl() {
    return siteUrl;
  }

  public void setSiteUrl(String siteUrl) {
    this.siteUrl = siteUrl;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }


  public long getIsShow() {
    return isShow;
  }

  public void setIsShow(long isShow) {
    this.isShow = isShow;
  }

}
