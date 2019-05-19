package com.company.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "ypc_auction_log", schema = "SIMULATE")
public class YpcAuctionLog {

    private long logId;
    private long actId;
    private long bidUser;
    private double bidPrice;
    private long bidTime;


    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }


    public long getActId() {
        return actId;
    }

    public void setActId(long actId) {
        this.actId = actId;
    }


    public long getBidUser() {
        return bidUser;
    }

    public void setBidUser(long bidUser) {
        this.bidUser = bidUser;
    }


    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }


    public long getBidTime() {
        return bidTime;
    }

    public void setBidTime(long bidTime) {
        this.bidTime = bidTime;
    }

}
