package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_config", schema = "SIMULATE")
public class YpcConfig {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;
  @Column(name = "name")
  private String name;
  @Column(name = "type")
  private String type;
  @Column(name = "description")
  private String description;
  @Column(name = "code")
  private String code;
  @Column(name = "config")
  private String config;
  @Column(name = "status")
  private long status;
  @Column(name = "created_at")
  private java.sql.Timestamp createdAt;
  @Column(name = "updated_at")
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
