package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ypc_friend_link", schema = "SIMULATE")
public class YpcFriendLink {

  private long linkId;
  private String linkName;
  private String linkUrl;
  private String linkLogo;
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
