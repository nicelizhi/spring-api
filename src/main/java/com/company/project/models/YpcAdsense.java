package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_adsense", schema = "SIMULATE")
public class YpcAdsense {

  private long fromAd;
  private String referer;
  private long clicks;


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


  public long getClicks() {
    return clicks;
  }

  public void setClicks(long clicks) {
    this.clicks = clicks;
  }

}
