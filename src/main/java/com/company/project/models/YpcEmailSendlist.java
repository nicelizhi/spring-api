package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_email_sendlist", schema = "SIMULATE")
public class YpcEmailSendlist {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "msg_id")
  private long id;
  @Column(name = "email")
  private String email;
  @Column(name = "template_id")
  private long templateId;
  @Column(name = "email_content")
  private String emailContent;
  @Column(name = "error")
  private long error;
  @Column(name = "pri")
  private long pri;
  @Column(name = "last_send")
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
