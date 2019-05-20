package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_suppliers", schema = "SIMULATE")
public class YpcSuppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "suppliers_id")
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
