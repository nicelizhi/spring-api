package com.company.project.models;

import javax.persistence.*;

@Entity
@Table (name = "ypc_area_region", schema="SIMULATE")
public class YpcAreaRegion {
  @Id
  @GeneratedValue (strategy=GenerationType.AUTO)
  @Column (name = "shipping_area_id")
  private long shippingAreaId;
  @Column (name = "region_id")
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
