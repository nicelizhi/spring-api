package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_goods_cat", schema = "SIMULATE")
public class YpcGoodsCat {

    @Id
    @Column(name = "goods_id")
    private long goodsId;
  private long catId;


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

}
