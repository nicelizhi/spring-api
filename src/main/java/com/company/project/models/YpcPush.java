package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_push", schema = "SIMULATE")
public class YpcPush {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;
  @Column(name = "user_id")
  private long userId;
  @Column(name = "title")
  private String title;
  @Column(name = "conteent")
  private String content;
  @Column(name = "photo")
  private String photo;
  @Column(name = "object_id")
  private String objectId;
  @Column(name = "link")
  private String link;
  @Column(name = "platform")
  private long platform;
  @Column(name = "push_type")
  private long pushType;
  @Column(name = "message_type")
  private long messageType;
  @Column(name = "is_push")
  private long isPush;
  @Column(name = "push_at")
  private java.sql.Timestamp pushAt;
  @Column(name = "status")
  private long status;
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  public long getPlatform() {
    return platform;
  }

  public void setPlatform(long platform) {
    this.platform = platform;
  }


  public long getPushType() {
    return pushType;
  }

  public void setPushType(long pushType) {
    this.pushType = pushType;
  }


  public long getMessageType() {
    return messageType;
  }

  public void setMessageType(long messageType) {
    this.messageType = messageType;
  }


  public long getIsPush() {
    return isPush;
  }

  public void setIsPush(long isPush) {
    this.isPush = isPush;
  }


  public java.sql.Timestamp getPushAt() {
    return pushAt;
  }

  public void setPushAt(java.sql.Timestamp pushAt) {
    this.pushAt = pushAt;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
