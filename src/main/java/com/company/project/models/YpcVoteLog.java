package com.company.project.models;

import javax.persistence.*;

@Entity
@Table (name = "ypc_vote_log", schema="SIMULATE")
public class YpcVoteLog {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  @Column (name = "log_id")
  private long logId;
  @Column (name = "vote_id")
  private long voteId;
  @Column (name = "ip_address")
  private String ipAddress;
  @Column (name = "vote_time")
  private long voteTime;

  public YpcVoteLog(){
    super();
  }

  public YpcVoteLog(long logId, long voteId, String ipAddress, long voteTime) {
    super();
    this.logId = logId;
    this.voteId = voteId;
    this.ipAddress  = ipAddress;
    this.voteTime = voteTime;
  }


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getVoteId() {
    return voteId;
  }

  public void setVoteId(long voteId) {
    this.voteId = voteId;
  }


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public long getVoteTime() {
    return voteTime;
  }

  public void setVoteTime(long voteTime) {
    this.voteTime = voteTime;
  }

}
