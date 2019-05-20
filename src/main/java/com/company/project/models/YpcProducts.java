package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_products", schema = "SIMULATE")
public class YpcProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private long productId;
  private long goodsId;
  private String goodsAttr;
  private String productSn;
  private long productNumber;


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getGoodsAttr() {
    return goodsAttr;
  }

  public void setGoodsAttr(String goodsAttr) {
    this.goodsAttr = goodsAttr;
  }


  public String getProductSn() {
    return productSn;
  }

  public void setProductSn(String productSn) {
    this.productSn = productSn;
  }


  public long getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(long productNumber) {
    this.productNumber = productNumber;
  }

}
