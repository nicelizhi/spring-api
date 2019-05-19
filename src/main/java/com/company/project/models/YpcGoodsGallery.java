package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_goods_gallery", schema = "SIMULATE")
public class YpcGoodsGallery {

  private long imgId;
  private long goodsId;
  private String imgUrl;
  private String imgDesc;
  private String thumbUrl;
  private String imgOriginal;
  private long sortOrder;


  public long getImgId() {
    return imgId;
  }

  public void setImgId(long imgId) {
    this.imgId = imgId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public String getImgDesc() {
    return imgDesc;
  }

  public void setImgDesc(String imgDesc) {
    this.imgDesc = imgDesc;
  }


  public String getThumbUrl() {
    return thumbUrl;
  }

  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }


  public String getImgOriginal() {
    return imgOriginal;
  }

  public void setImgOriginal(String imgOriginal) {
    this.imgOriginal = imgOriginal;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }

}
