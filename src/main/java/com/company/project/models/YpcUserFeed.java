package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_user_feed", schema = "SIMULATE")
public class YpcUserFeed {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "feed_id")
  private long feedId;
  @Column(name = "user_id")
  private long userId;
  @Column(name = "value_id")
  private long valueId;
  @Column(name = "goods_id")
  private long goodsId;
  @Column(name = "feed_type")
  private long feedType;
  @Column(name = "is_feed")
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
