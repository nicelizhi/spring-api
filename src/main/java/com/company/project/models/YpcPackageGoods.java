package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_package_goods", schema = "SIMULATE")
public class YpcPackageGoods {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "package_id")
  private long packageId;
  private long goodsId;
  private long productId;
  private long goodsNumber;
  private long adminId;


  public long getPackageId() {
    return packageId;
  }

  public void setPackageId(long packageId) {
    this.packageId = packageId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(long adminId) {
    this.adminId = adminId;
  }

}
