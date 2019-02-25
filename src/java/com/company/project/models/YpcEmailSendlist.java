package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcEmailSendlist {

  private long id;
  private String email;
  private long templateId;
  private String emailContent;
  private long error;
  private long pri;
  private long lastSend;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(long templateId) {
    this.templateId = templateId;
  }


  public String getEmailContent() {
    return emailContent;
  }

  public void setEmailContent(String emailContent) {
    this.emailContent = emailContent;
  }


  public long getError() {
    return error;
  }

  public void setError(long error) {
    this.error = error;
  }


  public long getPri() {
    return pri;
  }

  public void setPri(long pri) {
    this.pri = pri;
  }


  public long getLastSend() {
    return lastSend;
  }

  public void setLastSend(long lastSend) {
    this.lastSend = lastSend;
  }

}
