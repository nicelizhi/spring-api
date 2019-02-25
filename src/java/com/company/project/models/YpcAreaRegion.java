package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcAreaRegion {

  private long shippingAreaId;
  private long regionId;


  public long getShippingAreaId() {
    return shippingAreaId;
  }

  public void setShippingAreaId(long shippingAreaId) {
    this.shippingAreaId = shippingAreaId;
  }


  public long getRegionId() {
    return regionId;
  }

  public void setRegionId(long regionId) {
    this.regionId = regionId;
  }

}
