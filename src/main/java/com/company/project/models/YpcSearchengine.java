package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_searchengine", schema = "SIMULATE")
public class YpcSearchengine {

    @Id
    @Column(name = "date")
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
