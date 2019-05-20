package com.company.project.models;

import javax.persistence.*;

@Entity
@Table(name = "ypc_role", schema = "SIMULATE")
public class YpcRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long roleId;
  private String roleName;
  private String actionList;
  private String roleDescribe;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getActionList() {
    return actionList;
  }

  public void setActionList(String actionList) {
    this.actionList = actionList;
  }


  public String getRoleDescribe() {
    return roleDescribe;
  }

  public void setRoleDescribe(String roleDescribe) {
    this.roleDescribe = roleDescribe;
  }

}
