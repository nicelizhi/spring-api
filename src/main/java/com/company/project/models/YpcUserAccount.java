package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_user_account", schema = "SIMULATE")
public class YpcUserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
  private long id;
  private long userId;
  private String adminUser;
  private double amount;
  private long addTime;
  private long paidTime;
  private String adminNote;
  private String userNote;
  private long processType;
  private String payment;
  private long isPaid;


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


  public String getAdminUser() {
    return adminUser;
  }

  public void setAdminUser(String adminUser) {
    this.adminUser = adminUser;
  }


  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getPaidTime() {
    return paidTime;
  }

  public void setPaidTime(long paidTime) {
    this.paidTime = paidTime;
  }


  public String getAdminNote() {
    return adminNote;
  }

  public void setAdminNote(String adminNote) {
    this.adminNote = adminNote;
  }


  public String getUserNote() {
    return userNote;
  }

  public void setUserNote(String userNote) {
    this.userNote = userNote;
  }


  public long getProcessType() {
    return processType;
  }

  public void setProcessType(long processType) {
    this.processType = processType;
  }


  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  public long getIsPaid() {
    return isPaid;
  }

  public void setIsPaid(long isPaid) {
    this.isPaid = isPaid;
  }

}
