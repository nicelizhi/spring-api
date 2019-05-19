package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_article_cat", schema = "SIMULATE")
public class YpcArticleCat {

  private long catId;
  private String catName;
  private long catType;
  private String keywords;
  private String catDesc;
  private long sortOrder;
  private long showInNav;
  private long parentId;


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


  public long getCatType() {
    return catType;
  }

  public void setCatType(long catType) {
    this.catType = catType;
  }


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public String getCatDesc() {
    return catDesc;
  }

  public void setCatDesc(String catDesc) {
    this.catDesc = catDesc;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }


  public long getShowInNav() {
    return showInNav;
  }

  public void setShowInNav(long showInNav) {
    this.showInNav = showInNav;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

}
