package com.company.project.models;

import javax.persistence.*;


@Entity
@Table(name = "ypc_coincidence", schema = "SIMULATE")
public class YpcCoincidence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id")
    private String typeId;
    private String type;
    private long time;


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}
