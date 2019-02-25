package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcSuppliers {

  private long suppliersId;
  private String suppliersName;
  private String suppliersDesc;
  private long isCheck;


  public long getSuppliersId() {
    return suppliersId;
  }

  public void setSuppliersId(long suppliersId) {
    this.suppliersId = suppliersId;
  }


  public String getSuppliersName() {
    return suppliersName;
  }

  public void setSuppliersName(String suppliersName) {
    this.suppliersName = suppliersName;
  }


  public String getSuppliersDesc() {
    return suppliersDesc;
  }

  public void setSuppliersDesc(String suppliersDesc) {
    this.suppliersDesc = suppliersDesc;
  }


  public long getIsCheck() {
    return isCheck;
  }

  public void setIsCheck(long isCheck) {
    this.isCheck = isCheck;
  }

}
