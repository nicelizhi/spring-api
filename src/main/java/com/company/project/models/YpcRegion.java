package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_region", schema = "SIMULATE")
public class YpcRegion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "region_id")
    private long regionId;
  private long parentId;
  private String regionName;
  private long regionType;
  private long agencyId;


  public long getRegionId() {
    return regionId;
  }

  public void setRegionId(long regionId) {
    this.regionId = regionId;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  public long getRegionType() {
    return regionType;
  }

  public void setRegionType(long regionType) {
    this.regionType = regionType;
  }


  public long getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(long agencyId) {
    this.agencyId = agencyId;
  }

}
