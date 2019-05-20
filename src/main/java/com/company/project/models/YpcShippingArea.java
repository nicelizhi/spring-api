package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_shipping_area", schema = "SIMULATE")
public class YpcShippingArea {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shipping_area_id")
    private long shippingAreaId;
  private String shippingAreaName;
  private long shippingId;
  private String configure;


  public long getShippingAreaId() {
    return shippingAreaId;
  }

  public void setShippingAreaId(long shippingAreaId) {
    this.shippingAreaId = shippingAreaId;
  }


  public String getShippingAreaName() {
    return shippingAreaName;
  }

  public void setShippingAreaName(String shippingAreaName) {
    this.shippingAreaName = shippingAreaName;
  }


  public long getShippingId() {
    return shippingId;
  }

  public void setShippingId(long shippingId) {
    this.shippingId = shippingId;
  }


  public String getConfigure() {
    return configure;
  }

  public void setConfigure(String configure) {
    this.configure = configure;
  }

}
