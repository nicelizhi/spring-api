package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_nav", schema = "SIMULATE")
public class YpcNav {

  private long id;
  private String ctype;
  private long cid;
  private String name;
  private long ifshow;
  private long vieworder;
  private long opennew;
  private String url;
  private String type;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCtype() {
    return ctype;
  }

  public void setCtype(String ctype) {
    this.ctype = ctype;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getIfshow() {
    return ifshow;
  }

  public void setIfshow(long ifshow) {
    this.ifshow = ifshow;
  }


  public long getVieworder() {
    return vieworder;
  }

  public void setVieworder(long vieworder) {
    this.vieworder = vieworder;
  }


  public long getOpennew() {
    return opennew;
  }

  public void setOpennew(long opennew) {
    this.opennew = opennew;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
