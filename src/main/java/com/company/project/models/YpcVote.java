package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcVote {

  private long voteId;
  private String voteName;
  private long startTime;
  private long endTime;
  private long canMulti;
  private long voteCount;


  public long getVoteId() {
    return voteId;
  }

  public void setVoteId(long voteId) {
    this.voteId = voteId;
  }


  public String getVoteName() {
    return voteName;
  }

  public void setVoteName(String voteName) {
    this.voteName = voteName;
  }


  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }


  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }


  public long getCanMulti() {
    return canMulti;
  }

  public void setCanMulti(long canMulti) {
    this.canMulti = canMulti;
  }


  public long getVoteCount() {
    return voteCount;
  }

  public void setVoteCount(long voteCount) {
    this.voteCount = voteCount;
  }

}
