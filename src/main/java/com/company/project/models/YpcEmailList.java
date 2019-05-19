package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_email_list", schema = "SIMULATE")
public class YpcEmailList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private long id;
  @Column(name = "email")
  private String email;
  @Column(name = "stat")
  private long stat;
  @Column(name = "hash")
  private String hash;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getStat() {
    return stat;
  }

  public void setStat(long stat) {
    this.stat = stat;
  }


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

}
