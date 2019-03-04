package com.company.project.models;

import javax.persistence.*;

@Entity
@Table (name = "ypc_admin_user", schema="SIMULATE")
public class YpcAdminUser {

  @Id
  @Column (name = "user_id")
  private long userId;
  @Column (name = "user_name")
  private String userName;
  @Column (name = "email")
  private String email;
  @Column (name = "password")
  private String password;
  @Column (name = "ec_salt")
  private String ecSalt;
  @Column (name = "add_time")
  private long addTime;
  @Column (name = "last_login")
  private long lastLogin;
  @Column (name = "last_ip")
  private String lastIp;
  @Column (name = "action_list")
  private String actionList;
  @Column (name = "nav_list")
  private String navList;
  @Column (name = "lang_type")
  private String langType;
  @Column (name = "agency_id")
  private long agencyId;
  @Column (name = "suppliers_id")
  private long suppliersId;
  @Column (name = "todolist")
  private String todolist;
  @Column (name = "role_id")
  private long roleId;
  @Column (name = "passport_uid")
  private String passportUid;
  @Column (name = "yq_create_time")
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
