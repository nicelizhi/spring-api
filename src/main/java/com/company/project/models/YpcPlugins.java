package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_plugins", schema = "SIMULATE")
public class YpcPlugins {

    @Id
    @Column(name = "code")
    private String code;
  private String version;
  private String library;
  private long assign;
  private long installDate;


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public String getLibrary() {
    return library;
  }

  public void setLibrary(String library) {
    this.library = library;
  }


  public long getAssign() {
    return assign;
  }

  public void setAssign(long assign) {
    this.assign = assign;
  }


  public long getInstallDate() {
    return installDate;
  }

  public void setInstallDate(long installDate) {
    this.installDate = installDate;
  }

}
