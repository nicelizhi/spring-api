package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcRegion {

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
