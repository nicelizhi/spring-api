package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcAdminUser {

  private long userId;
  private String userName;
  private String email;
  private String password;
  private String ecSalt;
  private long addTime;
  private long lastLogin;
  private String lastIp;
  private String actionList;
  private String navList;
  private String langType;
  private long agencyId;
  private long suppliersId;
  private String todolist;
  private long roleId;
  private String passportUid;
  private long yqCreateTime;


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


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEcSalt() {
    return ecSalt;
  }

  public void setEcSalt(String ecSalt) {
    this.ecSalt = ecSalt;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(long lastLogin) {
    this.lastLogin = lastLogin;
  }


  public String getLastIp() {
    return lastIp;
  }

  public void setLastIp(String lastIp) {
    this.lastIp = lastIp;
  }


  public String getActionList() {
    return actionList;
  }

  public void setActionList(String actionList) {
    this.actionList = actionList;
  }


  public String getNavList() {
    return navList;
  }

  public void setNavList(String navList) {
    this.navList = navList;
  }


  public String getLangType() {
    return langType;
  }

  public void setLangType(String langType) {
    this.langType = langType;
  }


  public long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }


  public long getSuppliersId() {
    return suppliersId;
  }

  public void setSuppliersId(long suppliersId) {
    this.suppliersId = suppliersId;
  }


  public String getTodolist() {
    return todolist;
  }

  public void setTodolist(String todolist) {
    this.todolist = todolist;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getPassportUid() {
    return passportUid;
  }

  public void setPassportUid(String passportUid) {
    this.passportUid = passportUid;
  }


  public long getYqCreateTime() {
    return yqCreateTime;
  }

  public void setYqCreateTime(long yqCreateTime) {
    this.yqCreateTime = yqCreateTime;
  }

}
