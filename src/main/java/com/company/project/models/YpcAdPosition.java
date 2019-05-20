package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_ad_position", schema = "SIMULATE")
public class YpcAdPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "position_id")
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
