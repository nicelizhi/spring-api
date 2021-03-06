package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_reg_fields", schema = "SIMULATE")
public class YpcRegFields {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
  private String regFieldName;
  private long disOrder;
  private long display;
  private long type;
  private long isNeed;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRegFieldName() {
    return regFieldName;
  }

  public void setRegFieldName(String regFieldName) {
    this.regFieldName = regFieldName;
  }


  public long getDisOrder() {
    return disOrder;
  }

  public void setDisOrder(long disOrder) {
    this.disOrder = disOrder;
  }


  public long getDisplay() {
    return display;
  }

  public void setDisplay(long display) {
    this.display = display;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getIsNeed() {
    return isNeed;
  }

  public void setIsNeed(long isNeed) {
    this.isNeed = isNeed;
  }

}
