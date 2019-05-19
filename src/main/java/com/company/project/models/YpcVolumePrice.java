package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_volume_price", schema = "SIMULATE")
public class YpcVolumePrice {

  private long priceType;
  private long goodsId;
  private long volumeNumber;
  private double volumePrice;


  public long getPriceType() {
    return priceType;
  }

  public void setPriceType(long priceType) {
    this.priceType = priceType;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getVolumeNumber() {
    return volumeNumber;
  }

  public void setVolumeNumber(long volumeNumber) {
    this.volumeNumber = volumeNumber;
  }


  public double getVolumePrice() {
    return volumePrice;
  }

  public void setVolumePrice(double volumePrice) {
    this.volumePrice = volumePrice;
  }

}
