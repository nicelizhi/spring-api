package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_goods_type", schema = "SIMULATE")
public class YpcGoodsType {

  private long catId;
  private String catName;
  private long enabled;
  private String attrGroup;


  public long getCatId() {
    return catId;
  }

  public void setCatId(long catId) {
    this.catId = catId;
  }


  public String getCatName() {
    return catName;
  }

  public void setCatName(String catName) {
    this.catName = catName;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }


  public String getAttrGroup() {
    return attrGroup;
  }

  public void setAttrGroup(String attrGroup) {
    this.attrGroup = attrGroup;
  }

}
