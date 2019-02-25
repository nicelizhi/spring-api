package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcShipping {

  private long shippingId;
  private String shippingCode;
  private String shippingName;
  private String shippingDesc;
  private String insure;
  private long supportCod;
  private long enabled;
  private String shippingPrint;
  private String printBg;
  private String configLable;
  private long printModel;
  private long shippingOrder;


  public long getShippingId() {
    return shippingId;
  }

  public void setShippingId(long shippingId) {
    this.shippingId = shippingId;
  }


  public String getShippingCode() {
    return shippingCode;
  }

  public void setShippingCode(String shippingCode) {
    this.shippingCode = shippingCode;
  }


  public String getShippingName() {
    return shippingName;
  }

  public void setShippingName(String shippingName) {
    this.shippingName = shippingName;
  }


  public String getShippingDesc() {
    return shippingDesc;
  }

  public void setShippingDesc(String shippingDesc) {
    this.shippingDesc = shippingDesc;
  }


  public String getInsure() {
    return insure;
  }

  public void setInsure(String insure) {
    this.insure = insure;
  }


  public long getSupportCod() {
    return supportCod;
  }

  public void setSupportCod(long supportCod) {
    this.supportCod = supportCod;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }


  public String getShippingPrint() {
    return shippingPrint;
  }

  public void setShippingPrint(String shippingPrint) {
    this.shippingPrint = shippingPrint;
  }


  public String getPrintBg() {
    return printBg;
  }

  public void setPrintBg(String printBg) {
    this.printBg = printBg;
  }


  public String getConfigLable() {
    return configLable;
  }

  public void setConfigLable(String configLable) {
    this.configLable = configLable;
  }


  public long getPrintModel() {
    return printModel;
  }

  public void setPrintModel(long printModel) {
    this.printModel = printModel;
  }


  public long getShippingOrder() {
    return shippingOrder;
  }

  public void setShippingOrder(long shippingOrder) {
    this.shippingOrder = shippingOrder;
  }

}
