package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_shop_bind", schema = "SIMULATE")
public class YpcShopBind {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "shop_id")
  private long shopId;
  @Column(name = "name")
  private String name;
  @Column(name = "node_id")
  private String nodeId;
  @Column(name = "node_type")
  private String nodeType;
  @Column(name = "status")
  private String status;
  @Column(name = "app_url")
  private String appUrl;


  public long getShopId() {
    return shopId;
  }

  public void setShopId(long shopId) {
    this.shopId = shopId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getAppUrl() {
    return appUrl;
  }

  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }

}
