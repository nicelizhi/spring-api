package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcCategory {

  private long catId;
  private String catName;
  private String keywords;
  private String catDesc;
  private long parentId;
  private long sortOrder;
  private String templateFile;
  private String measureUnit;
  private long showInNav;
  private String style;
  private long isShow;
  private long grade;
  private String filterAttr;


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


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }


  public String getTemplateFile() {
    return templateFile;
  }

  public void setTemplateFile(String templateFile) {
    this.templateFile = templateFile;
  }


  public String getMeasureUnit() {
    return measureUnit;
  }

  public void setMeasureUnit(String measureUnit) {
    this.measureUnit = measureUnit;
  }


  public long getShowInNav() {
    return showInNav;
  }

  public void setShowInNav(long showInNav) {
    this.showInNav = showInNav;
  }


  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }


  public long getIsShow() {
    return isShow;
  }

  public void setIsShow(long isShow) {
    this.isShow = isShow;
  }


  public long getGrade() {
    return grade;
  }

  public void setGrade(long grade) {
    this.grade = grade;
  }


  public String getFilterAttr() {
    return filterAttr;
  }

  public void setFilterAttr(String filterAttr) {
    this.filterAttr = filterAttr;
  }

}
