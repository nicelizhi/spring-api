package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_crons", schema = "SIMULATE")
public class YpcCrons {

  private long cronId;
  private String cronCode;
  private String cronName;
  private String cronDesc;
  private long cronOrder;
  private String cronConfig;
  private long thistime;
  private long nextime;
  private long day;
  private String week;
  private String hour;
  private String minute;
  private long enable;
  private long runOnce;
  private String allowIp;
  private String alowFiles;


  public long getCronId() {
    return cronId;
  }

  public void setCronId(long cronId) {
    this.cronId = cronId;
  }


  public String getCronCode() {
    return cronCode;
  }

  public void setCronCode(String cronCode) {
    this.cronCode = cronCode;
  }


  public String getCronName() {
    return cronName;
  }

  public void setCronName(String cronName) {
    this.cronName = cronName;
  }


  public String getCronDesc() {
    return cronDesc;
  }

  public void setCronDesc(String cronDesc) {
    this.cronDesc = cronDesc;
  }


  public long getCronOrder() {
    return cronOrder;
  }

  public void setCronOrder(long cronOrder) {
    this.cronOrder = cronOrder;
  }


  public String getCronConfig() {
    return cronConfig;
  }

  public void setCronConfig(String cronConfig) {
    this.cronConfig = cronConfig;
  }


  public long getThistime() {
    return thistime;
  }

  public void setThistime(long thistime) {
    this.thistime = thistime;
  }


  public long getNextime() {
    return nextime;
  }

  public void setNextime(long nextime) {
    this.nextime = nextime;
  }


  public long getDay() {
    return day;
  }

  public void setDay(long day) {
    this.day = day;
  }


  public String getWeek() {
    return week;
  }

  public void setWeek(String week) {
    this.week = week;
  }


  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }


  public String getMinute() {
    return minute;
  }

  public void setMinute(String minute) {
    this.minute = minute;
  }


  public long getEnable() {
    return enable;
  }

  public void setEnable(long enable) {
    this.enable = enable;
  }


  public long getRunOnce() {
    return runOnce;
  }

  public void setRunOnce(long runOnce) {
    this.runOnce = runOnce;
  }


  public String getAllowIp() {
    return allowIp;
  }

  public void setAllowIp(String allowIp) {
    this.allowIp = allowIp;
  }


  public String getAlowFiles() {
    return alowFiles;
  }

  public void setAlowFiles(String alowFiles) {
    this.alowFiles = alowFiles;
  }

}
