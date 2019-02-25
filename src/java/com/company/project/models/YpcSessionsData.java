package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcSessionsData {

  private String sesskey;
  private long expiry;
  private String data;


  public String getSesskey() {
    return sesskey;
  }

  public void setSesskey(String sesskey) {
    this.sesskey = sesskey;
  }


  public long getExpiry() {
    return expiry;
  }

  public void setExpiry(long expiry) {
    this.expiry = expiry;
  }


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

}
