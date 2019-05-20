package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_sessions_data", schema = "SIMULATE")
public class YpcSessionsData {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "sess_key")
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
