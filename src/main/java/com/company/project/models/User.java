package com.company.project.models;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="ypc_users", schema="SIMULATE")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer user_id;

    private String username;
    private String password;
    private String nick_name;
    private Integer sex;
    private Date regsiter_date;

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
    public void setNick_name(String nick_name){
        this.nick_name = nick_name;
    }

    public String getNick_name(){
        return this.nick_name;
    }
    public void setSex(Integer sex){
        this.sex = sex;
    }

    public Integer getSex(){
        return this.sex;
    }

    public void setRegsiter_date(Date regsiter_date){
        this.regsiter_date = regsiter_date;
    }

    public Date getRegsiter_date(){
        return this.regsiter_date;
    }

}