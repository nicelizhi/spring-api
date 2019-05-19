package com.company.project.models;

import org.graalvm.compiler.api.replacements.ClassSubstitution;

import javax.persistence.*;


@Entity
@Table(name = "ypc_category", schema = "SIMULATE")
public class YpcCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "cat_id")
  private long catId;
  @Column(name = "cat_name")
  private String catName;
  @Column(name = "keywords")
  private String keywords;
  @Column(name = "cat_desc")
  private String catDesc;
  @Column(name = "parent_id")
  private long parentId;
  @Column(name = "sort_order")
  private long sortOrder;
  @Column(name = "template_file")
  private String templateFile;
  @Column(name = "measure_unit")
  private String measureUnit;
  @Column(name = "show_in_nav")
  private long showInNav;
  @Column(name = "style")
  private String style;
  @Column(name = "is_show")
  private long isShow;
  @Column(name = "grade")
  private long grade;
  @Column(name = "filter_attr")
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
