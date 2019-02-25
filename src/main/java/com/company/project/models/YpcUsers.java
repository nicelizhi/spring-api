package com.company.project.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="ypc_users", schema="SIMULATE")
public class YpcUsers {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name ="user_id")
  private Integer userId;

  private String email;

  @Column(name ="user_name")
  private String userName;

  private String password;

  private String question;

  private String answer;

  private long sex;

  private String birthday;
  @Column(name ="user_money")
  private double userMoney;
  @Column(name ="frozen_money")
  private double frozenMoney;
  @Column(name ="pay_points")
  private long payPoints;
  @Column(name ="rank_points")
  private long rankPoints;
  @Column(name ="address_id")
  private long addressId;
  @Column(name ="reg_time")
  private long regTime;
  @Column(name ="last_login")
  private long lastLogin;
  @Column(name ="last_time")
  private Timestamp lastTime;
  @Column(name ="last_ip")
  private String lastIp;
  @Column(name ="visit_count")
  private long visitCount;
  @Column(name ="user_rank")
  private long userRank;
  @Column(name ="is_special")
  private long isSpecial;

  private String ecSalt;

  private String salt;
  @Column(name ="parent_id")
  private long parentId;

  private long flag;

  private String alias;

  private String msn;

  private String qq;
  @Column(name ="office_phone")
  private String officePhone;
  @Column(name ="home_phone")
  private String homePhone;
  @Column(name ="mobile_phone")
  private String mobilePhone;
  @Column(name ="is_validated")
  private long isValidated;
  @Column(name ="credit_line")
  private double creditLine;
  @Column(name ="passwd_question")
  private String passwdQuestion;
  @Column(name ="passwd_answer")
  private String passwdAnswer;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday){
    this.birthday = birthday;
  }


  public double getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(double userMoney) {
    this.userMoney = userMoney;
  }


  public double getFrozenMoney() {
    return frozenMoney;
  }

  public void setFrozenMoney(double frozenMoney) {
    this.frozenMoney = frozenMoney;
  }


  public long getPayPoints() {
    return payPoints;
  }

  public void setPayPoints(long payPoints) {
    this.payPoints = payPoints;
  }


  public long getRankPoints() {
    return rankPoints;
  }

  public void setRankPoints(long rankPoints) {
    this.rankPoints = rankPoints;
  }


  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public long getRegTime() {
    return regTime;
  }

  public void setRegTime(long regTime) {
    this.regTime = regTime;
  }


  public long getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(long lastLogin) {
    this.lastLogin = lastLogin;
  }


  public Timestamp getLastTime() {
    return lastTime;
  }

  public void setLastTime(Timestamp lastTime) {
    this.lastTime = lastTime;
  }


  public String getLastIp() {
    return lastIp;
  }

  public void setLastIp(String lastIp) {
    this.lastIp = lastIp;
  }


  public long getVisitCount() {
    return visitCount;
  }

  public void setVisitCount(long visitCount) {
    this.visitCount = visitCount;
  }


  public long getUserRank() {
    return userRank;
  }

  public void setUserRank(long userRank) {
    this.userRank = userRank;
  }


  public long getIsSpecial() {
    return isSpecial;
  }

  public void setIsSpecial(long isSpecial) {
    this.isSpecial = isSpecial;
  }


  public String getEcSalt() {
    return ecSalt;
  }

  public void setEcSalt(String ecSalt) {
    this.ecSalt = ecSalt;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getFlag() {
    return flag;
  }

  public void setFlag(long flag) {
    this.flag = flag;
  }


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public String getMsn() {
    return msn;
  }

  public void setMsn(String msn) {
    this.msn = msn;
  }


  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }


  public String getOfficePhone() {
    return officePhone;
  }

  public void setOfficePhone(String officePhone) {
    this.officePhone = officePhone;
  }


  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }


  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public long getIsValidated() {
    return isValidated;
  }

  public void setIsValidated(long isValidated) {
    this.isValidated = isValidated;
  }


  public double getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(double creditLine) {
    this.creditLine = creditLine;
  }


  public String getPasswdQuestion() {
    return passwdQuestion;
  }

  public void setPasswdQuestion(String passwdQuestion) {
    this.passwdQuestion = passwdQuestion;
  }


  public String getPasswdAnswer() {
    return passwdAnswer;
  }

  public void setPasswdAnswer(String passwdAnswer) {
    this.passwdAnswer = passwdAnswer;
  }

}
