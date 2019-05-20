package com.company.project.models;

import javax.persistence.*;


@Entity
@Table(name = "ypc_cert", schema = "SIMULATE")
public class YpcCert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
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
