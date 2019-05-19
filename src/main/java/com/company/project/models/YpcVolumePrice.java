package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_volume_price", schema = "SIMULATE")
public class YpcVolumePrice {

  @Column(name = "price_type")
  private long priceType;

  @Column(name = "goods_id")
  private long goodsId;

  @Column(name = "volume_number")
  private long volumeNumber;

  @Column(name = "volume_price")
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
