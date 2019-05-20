package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_admin_message", schema = "SIMULATE")
public class YpcAdminMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "message_id")
    private long messageId;
  private long senderId;
  private long receiverId;
  private long sentTime;
  private long readTime;
  private long readed;
  private long deleted;
  private String title;
  private String message;


  public long getMessageId() {
    return messageId;
  }

  public void setMessageId(long messageId) {
    this.messageId = messageId;
  }


  public long getSenderId() {
    return senderId;
  }

  public void setSenderId(long senderId) {
    this.senderId = senderId;
  }


  public long getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(long receiverId) {
    this.receiverId = receiverId;
  }


  public long getSentTime() {
    return sentTime;
  }

  public void setSentTime(long sentTime) {
    this.sentTime = sentTime;
  }


  public long getReadTime() {
    return readTime;
  }

  public void setReadTime(long readTime) {
    this.readTime = readTime;
  }


  public long getReaded() {
    return readed;
  }

  public void setReaded(long readed) {
    this.readed = readed;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
