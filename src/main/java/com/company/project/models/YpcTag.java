package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_tag", schema = "SIMULATE")
public class YpcTag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private long tagId;
  private long userId;
  private long goodsId;
  private String tagWords;


  public long getTagId() {
    return tagId;
  }

  public void setTagId(long tagId) {
    this.tagId = tagId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public String getTagWords() {
    return tagWords;
  }

  public void setTagWords(String tagWords) {
    this.tagWords = tagWords;
  }

}
