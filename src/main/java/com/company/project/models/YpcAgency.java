package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcAgency {

  private long agencyId;
  private String agencyName;
  private String agencyDesc;


  public long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }


  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }


  public String getAgencyDesc() {
    return agencyDesc;
  }

  public void setAgencyDesc(String agencyDesc) {
    this.agencyDesc = agencyDesc;
  }

}
