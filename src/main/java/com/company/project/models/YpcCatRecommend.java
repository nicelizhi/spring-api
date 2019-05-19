package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_cat_recommend", schema = "SIMULATE")
public class YpcCatRecommend {

  @Id
  @Column(name = "cat_id")
  private long catId;
  @Column(name = "recommend_type")
  private long recommendType;


  public long getCatId() {
    return catId;
  }

  public void setCatId(long catId) {
    this.catId = catId;
  }


  public long getRecommendType() {
    return recommendType;
  }

  public void setRecommendType(long recommendType) {
    this.recommendType = recommendType;
  }

}
