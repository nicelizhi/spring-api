package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_ad_custome")
public class YpcAdCustom {

  @Column(name = "ad_id")
  private long adId;
  @Column(name = "ad_type")
  private long adType;
  @Column(name = "ad_name")
  private String adName;
  @Column(name = "add_time")
  private long addTime;
  private String content;
  private String url;
  private long adStatus;


  public long getAdId() {
    return adId;
  }

  public void setAdId(long adId) {
    this.adId = adId;
  }


  public long getAdType() {
    return adType;
  }

  public void setAdType(long adType) {
    this.adType = adType;
  }


  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public long getAdStatus() {
    return adStatus;
  }

  public void setAdStatus(long adStatus) {
    this.adStatus = adStatus;
  }

}
