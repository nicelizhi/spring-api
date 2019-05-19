package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_user_regstatus", schema = "SIMULATE")
public class YpcUserRegStatus {

  private long userId;
  private long isCompleted;


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(long isCompleted) {
    this.isCompleted = isCompleted;
  }

}
