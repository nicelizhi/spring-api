package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_user_feed", schema = "SIMULATE")
public class YpcUserFeed {

  private long feedId;
  private long userId;
  private long valueId;
  private long goodsId;
  private long feedType;
  private long isFeed;


  public long getFeedId() {
    return feedId;
  }

  public void setFeedId(long feedId) {
    this.feedId = feedId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getValueId() {
    return valueId;
  }

  public void setValueId(long valueId) {
    this.valueId = valueId;
  }


  public long getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(long goodsId) {
    this.goodsId = goodsId;
  }


  public long getFeedType() {
    return feedType;
  }

  public void setFeedType(long feedType) {
    this.feedType = feedType;
  }


  public long getIsFeed() {
    return isFeed;
  }

  public void setIsFeed(long isFeed) {
    this.isFeed = isFeed;
  }

}
