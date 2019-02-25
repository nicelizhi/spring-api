package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcStats {

  private long accessTime;
  private String ipAddress;
  private long visitTimes;
  private String browser;
  private String system;
  private String language;
  private String area;
  private String refererDomain;
  private String refererPath;
  private String accessUrl;


  public long getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(long accessTime) {
    this.accessTime = accessTime;
  }


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public long getVisitTimes() {
    return visitTimes;
  }

  public void setVisitTimes(long visitTimes) {
    this.visitTimes = visitTimes;
  }


  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }


  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  public String getRefererDomain() {
    return refererDomain;
  }

  public void setRefererDomain(String refererDomain) {
    this.refererDomain = refererDomain;
  }


  public String getRefererPath() {
    return refererPath;
  }

  public void setRefererPath(String refererPath) {
    this.refererPath = refererPath;
  }


  public String getAccessUrl() {
    return accessUrl;
  }

  public void setAccessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
  }

}
