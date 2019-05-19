package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_friend_link", schema = "SIMULATE")
public class YpcFriendLink {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "link_id")
  private long linkId;
  @Column(name = "link_name")
  private String linkName;
  @Column(name = "link_url")
  private String linkUrl;
  @Column(name = "link_logo")
  private String linkLogo;
  @Column(name = "show_order")
  private long showOrder;


  public long getLinkId() {
    return linkId;
  }

  public void setLinkId(long linkId) {
    this.linkId = linkId;
  }


  public String getLinkName() {
    return linkName;
  }

  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }


  public String getLinkUrl() {
    return linkUrl;
  }

  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public String getLinkLogo() {
    return linkLogo;
  }

  public void setLinkLogo(String linkLogo) {
    this.linkLogo = linkLogo;
  }


  public long getShowOrder() {
    return showOrder;
  }

  public void setShowOrder(long showOrder) {
    this.showOrder = showOrder;
  }

}
