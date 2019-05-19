package com.company.project.models;

import javax.persistence.*;


@Entity
@Table(name = "ypc_ad", schema = "SIMULATE")
public class YpcAd {

  @Id
  @Column(name = "ad_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long adId;
  private long positionId;
  private long mediaType;
  private String adName;
  private String adLink;
  private String adCode;
  private long startTime;
  private long endTime;
  private String linkMan;
  private String linkEmail;
  private String linkPhone;
  private long clickCount;
  private long enabled;


  public long getAdId() {
    return adId;
  }

  public void setAdId(long adId) {
    this.adId = adId;
  }


  public long getPositionId() {
    return positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }


  public long getMediaType() {
    return mediaType;
  }

  public void setMediaType(long mediaType) {
    this.mediaType = mediaType;
  }


  public String getAdName() {
    return adName;
  }

  public void setAdName(String adName) {
    this.adName = adName;
  }


  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }


  public String getAdCode() {
    return adCode;
  }

  public void setAdCode(String adCode) {
    this.adCode = adCode;
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


  public String getLinkMan() {
    return linkMan;
  }

  public void setLinkMan(String linkMan) {
    this.linkMan = linkMan;
  }


  public String getLinkEmail() {
    return linkEmail;
  }

  public void setLinkEmail(String linkEmail) {
    this.linkEmail = linkEmail;
  }


  public String getLinkPhone() {
    return linkPhone;
  }

  public void setLinkPhone(String linkPhone) {
    this.linkPhone = linkPhone;
  }


  public long getClickCount() {
    return clickCount;
  }

  public void setClickCount(long clickCount) {
    this.clickCount = clickCount;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }

}
