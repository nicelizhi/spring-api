package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_vote_option", schema = "SIMULATE")
public class YpcVoteOption {

  private long optionId;
  private long voteId;
  private String optionName;
  private long optionCount;
  private long optionOrder;


  public long getOptionId() {
    return optionId;
  }

  public void setOptionId(long optionId) {
    this.optionId = optionId;
  }


  public long getVoteId() {
    return voteId;
  }

  public void setVoteId(long voteId) {
    this.voteId = voteId;
  }


  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }


  public long getOptionCount() {
    return optionCount;
  }

  public void setOptionCount(long optionCount) {
    this.optionCount = optionCount;
  }


  public long getOptionOrder() {
    return optionOrder;
  }

  public void setOptionOrder(long optionOrder) {
    this.optionOrder = optionOrder;
  }

}
