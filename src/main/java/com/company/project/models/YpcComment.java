package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_comment", schema = "SIMULATE")
public class YpcComment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    private long commentId;
  private long commentType;
  private long idValue;
  private String email;
  private String userName;
  private String content;
  private long commentRank;
  private long addTime;
  private String ipAddress;
  private long status;
  private long parentId;
  private long userId;


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }


  public long getCommentType() {
    return commentType;
  }

  public void setCommentType(long commentType) {
    this.commentType = commentType;
  }


  public long getIdValue() {
    return idValue;
  }

  public void setIdValue(long idValue) {
    this.idValue = idValue;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getCommentRank() {
    return commentRank;
  }

  public void setCommentRank(long commentRank) {
    this.commentRank = commentRank;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

}
