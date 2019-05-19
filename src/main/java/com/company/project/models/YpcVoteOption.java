package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_vote_option", schema = "SIMULATE")
public class YpcVoteOption {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "option_id")
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
