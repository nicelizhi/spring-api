package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_agency",  schema="SIMULATE")
public class YpcAgency {

  @Id
  @Column (name = "agency_id")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer agencyId;
  @Column(name = "agency_name")
  private String agencyName;
  @Column (name = "agency_desc")
  private String agencyDesc;


  public Integer getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(Integer agencyId) {
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
