package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class YpcCert {

  private long id;
  private long configId;
  private String file;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getConfigId() {
    return configId;
  }

  public void setConfigId(long configId) {
    this.configId = configId;
  }


  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

}
