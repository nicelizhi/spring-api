package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcMailTemplates {

  private long templateId;
  private String templateCode;
  private long isHtml;
  private String templateSubject;
  private String templateContent;
  private long lastModify;
  private long lastSend;
  private String type;


  public long getTemplateId() {
    return templateId;
  }

  public void setTemplateId(long templateId) {
    this.templateId = templateId;
  }


  public String getTemplateCode() {
    return templateCode;
  }

  public void setTemplateCode(String templateCode) {
    this.templateCode = templateCode;
  }


  public long getIsHtml() {
    return isHtml;
  }

  public void setIsHtml(long isHtml) {
    this.isHtml = isHtml;
  }


  public String getTemplateSubject() {
    return templateSubject;
  }

  public void setTemplateSubject(String templateSubject) {
    this.templateSubject = templateSubject;
  }


  public String getTemplateContent() {
    return templateContent;
  }

  public void setTemplateContent(String templateContent) {
    this.templateContent = templateContent;
  }


  public long getLastModify() {
    return lastModify;
  }

  public void setLastModify(long lastModify) {
    this.lastModify = lastModify;
  }


  public long getLastSend() {
    return lastSend;
  }

  public void setLastSend(long lastSend) {
    this.lastSend = lastSend;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
