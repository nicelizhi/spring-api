package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcShopConfig {

  private long id;
  private long parentId;
  private String code;
  private String type;
  private String storeRange;
  private String storeDir;
  private String value;
  private long sortOrder;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getStoreRange() {
    return storeRange;
  }

  public void setStoreRange(String storeRange) {
    this.storeRange = storeRange;
  }


  public String getStoreDir() {
    return storeDir;
  }

  public void setStoreDir(String storeDir) {
    this.storeDir = storeDir;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public long getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(long sortOrder) {
    this.sortOrder = sortOrder;
  }

}
