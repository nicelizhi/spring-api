package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_user_regstatus", schema = "SIMULATE")
public class YpcUserRegStatus {

    @Id
    @Column(name = "user_id")
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
