package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_reg_extend_info", schema = "SIMULATE")
public class YpcRegExtendInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
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
