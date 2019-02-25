package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcRegExtendInfo {

  private long id;
  private long userId;
  private long regFieldId;
  private String content;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getRegFieldId() {
    return regFieldId;
  }

  public void setRegFieldId(long regFieldId) {
    this.regFieldId = regFieldId;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

}
