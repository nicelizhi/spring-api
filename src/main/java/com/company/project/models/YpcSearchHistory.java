package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_search_history", schema = "SIMULATE")
public class YpcSearchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
  private long id;
  private String keyword;
  private long count;
  private String type;
  private long storeId;
  private long updated;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public long getStoreId() {
    return storeId;
  }

  public void setStoreId(long storeId) {
    this.storeId = storeId;
  }


  public long getUpdated() {
    return updated;
  }

  public void setUpdated(long updated) {
    this.updated = updated;
  }

}
