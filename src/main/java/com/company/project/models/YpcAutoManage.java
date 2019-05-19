package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_auto_manage", schema = "SIMULATE")
public class YpcAutoManage {

  private long itemId;
  private String type;
  private long starttime;
  private long endtime;


  public long getItemId() {
    return itemId;
  }

  public void setItemId(long itemId) {
    this.itemId = itemId;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public long getStarttime() {
    return starttime;
  }

  public void setStarttime(long starttime) {
    this.starttime = starttime;
  }


  public long getEndtime() {
    return endtime;
  }

  public void setEndtime(long endtime) {
    this.endtime = endtime;
  }

}
