package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_goods_article", schema = "SIMULATE")
public class YpcGoodsArticle {

    @Id
    @Column(name = "goods_id")
    private long goodsId;
  private long articleId;
  private long adminId;


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public long getAdminId() {
    return adminId;
  }

  public void setAdminId(long adminId) {
    this.adminId = adminId;
  }

}
