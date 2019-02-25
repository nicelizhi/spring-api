package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcCatRecommend {

  private long catId;
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
