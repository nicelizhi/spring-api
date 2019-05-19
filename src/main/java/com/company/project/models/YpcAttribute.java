package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_attribute", schema = "SIMULATE")
public class YpcAttribute {

  private long attrId;
  private long catId;
  private String attrName;
  private long attrInputType;
  private long attrType;
  private String attrValues;
  private long attrIndex;
  private long sortOrder;
  private long isLinked;
  private long attrGroup;


  public long getAttrId() {
    return attrId;
  }

  public void setAttrId(long attrId) {
    this.attrId = attrId;
  }


  public long getCatId() {
    return catId;
  }

  public void setCatId(long catId) {
    this.catId = catId;
  }


  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }


  public long getAttrInputType() {
    return attrInputType;
  }

  public void setAttrInputType(long attrInputType) {
    this.attrInputType = attrInputType;
  }


  public long getAttrType() {
    return attrType;
  }

  public void setAttrType(long attrType) {
    this.attrType = attrType;
  }


  public String getAttrValues() {
    return attrValues;
  }

  public void setAttrValues(String attrValues) {
    this.attrValues = attrValues;
  }


  public long getAttrIndex() {
    return attrIndex;
  }

  public void setAttrIndex(long attrIndex) {
    this.attrIndex = attrIndex;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }


  public long getIsLinked() {
    return isLinked;
  }

  public void setIsLinked(long isLinked) {
    this.isLinked = isLinked;
  }


  public long getAttrGroup() {
    return attrGroup;
  }

  public void setAttrGroup(long attrGroup) {
    this.attrGroup = attrGroup;
  }

}
