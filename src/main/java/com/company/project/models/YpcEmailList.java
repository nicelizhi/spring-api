package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcEmailList {

  private long id;
  private String email;
  private long stat;
  private String hash;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getStat() {
    return stat;
  }

  public void setStat(long stat) {
    this.stat = stat;
  }


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

}
