package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_feedback", schema = "SIMULATE")
public class YpcFeedback {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "msg_id")
  private long msgId;
  @Column(name = "parent_id")
  private long parentId;
  @Column(name = "user_id")
  private long userId;
  @Column(name = "user_name")
  private String userName;
  @Column(name = "user_email")
  private String userEmail;
  @Column(name = "msg_title")
  private String msgTitle;
  @Column(name = "msg_type")
  private long msgType;
  @Column(name = "msg_status")
  private long msgStatus;
  @Column(name = "msg_content")
  private String msgContent;
  @Column(name = "msg_time")
  private long msgTime;
  @Column(name = "message_img")
  private String messageImg;
  @Column(name = "order_id")
  private long orderId;
  @Column(name = "msg_area")
  private long msgArea;


  public long getMsgId() {
    return msgId;
  }

  public void setMsgId(long msgId) {
    this.msgId = msgId;
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


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getMsgTitle() {
    return msgTitle;
  }

  public void setMsgTitle(String msgTitle) {
    this.msgTitle = msgTitle;
  }


  public long getMsgType() {
    return msgType;
  }

  public void setMsgType(long msgType) {
    this.msgType = msgType;
  }


  public long getMsgStatus() {
    return msgStatus;
  }

  public void setMsgStatus(long msgStatus) {
    this.msgStatus = msgStatus;
  }


  public String getMsgContent() {
    return msgContent;
  }

  public void setMsgContent(String msgContent) {
    this.msgContent = msgContent;
  }


  public long getMsgTime() {
    return msgTime;
  }

  public void setMsgTime(long msgTime) {
    this.msgTime = msgTime;
  }


  public String getMessageImg() {
    return messageImg;
  }

  public void setMessageImg(String messageImg) {
    this.messageImg = messageImg;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getMsgArea() {
    return msgArea;
  }

  public void setMsgArea(long msgArea) {
    this.msgArea = msgArea;
  }

}
