package com.company.project.models;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="ypc_vote", schema="SIMULATE")
public class YpcVote {

  @Id
  @GeneratedValue (strategy=GenerationType.AUTO)
  @Column(name = "vote_id")
  private long voteId;
  @Column (name = "vote_name")
  private String voteName;
  @Column (name = "start_time")
  private long startTime;
  @Column (name = "end_time")
  private long endTime;
  @Column (name = "can_multi")
  private long canMulti;
  @Column (name = "vote_count")
  private long voteCount;

  //
  public YpcVote(){
    super();
  }

  //
  public YpcVote(long voteId, String voteName, long startTime, long endTime, long canMulti, long voteCount){
    super();
    this.voteId = voteId;
    this.voteName = voteName;
    this.startTime = startTime;
    this.endTime = endTime;
    this.canMulti = canMulti;
    this.voteCount = voteCount;
  }

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
