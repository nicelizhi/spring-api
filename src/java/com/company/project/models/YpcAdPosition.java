package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcAdPosition {

  private long positionId;
  private String positionName;
  private long adWidth;
  private long adHeight;
  private String positionDesc;
  private String positionStyle;


  public long getPositionId() {
    return positionId;
  }

  public void setPositionId(long positionId) {
    this.positionId = positionId;
  }


  public String getPositionName() {
    return positionName;
  }

  public void setPositionName(String positionName) {
    this.positionName = positionName;
  }


  public long getAdWidth() {
    return adWidth;
  }

  public void setAdWidth(long adWidth) {
    this.adWidth = adWidth;
  }


  public long getAdHeight() {
    return adHeight;
  }

  public void setAdHeight(long adHeight) {
    this.adHeight = adHeight;
  }


  public String getPositionDesc() {
    return positionDesc;
  }

  public void setPositionDesc(String positionDesc) {
    this.positionDesc = positionDesc;
  }


  public String getPositionStyle() {
    return positionStyle;
  }

  public void setPositionStyle(String positionStyle) {
    this.positionStyle = positionStyle;
  }

}
