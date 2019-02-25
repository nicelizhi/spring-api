package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcSearchengine {

  private java.sql.Date date;
  private String searchengine;
  private long count;


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }


  public String getSearchengine() {
    return searchengine;
  }

  public void setSearchengine(String searchengine) {
    this.searchengine = searchengine;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

}
