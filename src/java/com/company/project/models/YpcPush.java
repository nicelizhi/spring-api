package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcPush {

  private long id;
  private long userId;
  private String title;
  private String content;
  private String photo;
  private String objectId;
  private String link;
  private long platform;
  private long pushType;
  private long messageType;
  private long isPush;
  private java.sql.Timestamp pushAt;
  private long status;
  private java.sql.Timestamp createdAt;
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
