package com.otms.newcomer.entity;

// consider using the following for date time
// import org.joda.time.LocalDateTimex

// basic java utilities
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="_order")
public class Order {
    public static void main(String[] args){
        System.out.println("Testing");
    }
    
    @Id
    @Column(name = "id", 
            unique = true,
            nullable = false)
    private Long id;
    
    @Column(name = "ord_num",
            unique = true)
    private String ordNum;
    
    @Column(name = "client")
    private String client;
    
    @Column(name = "erp_num", nullable = false)
    private String erpNum;
    
    @Column(name = "pickup_date")
    private Date pickup_date;
    
    @Column(name = "delivery_date")
    private Date delivery_date;
    
    @Column(name = "act_pickup_date")
    private Date act_pickup_date;
    
    @Column(name = "act_delivery_date")
    private Date act_delivery_date;
    
    @Column(name = "shipfrom_loc")
    private Long shipfrom_loc;
    
    @Column(name = "shipto_loc")
    private Long shipto_loc;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getErpNum() {
        return erpNum;
    }

    public void setErpNum(String erpNum) {
        this.erpNum = erpNum;
    }

    public Date getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(Date pickup_date) {
        this.pickup_date = pickup_date;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }

    public Date getAct_pickup_date() {
        return act_pickup_date;
    }

    public void setAct_pickup_date(Date act_pickup_date) {
        this.act_pickup_date = act_pickup_date;
    }

    public Date getAct_delivery_date() {
        return act_delivery_date;
    }

    public void setAct_delivery_date(Date act_delivery_date) {
        this.act_delivery_date = act_delivery_date;
    }

    public long getShipfrom_loc() {
        return shipfrom_loc;
    }

    public void setShipfrom_loc(long shipfrom_loc) {
        this.shipfrom_loc = shipfrom_loc;
    }

    public long getShipto_loc() {
        return shipto_loc;
    }

    public void setShipto_loc(long shipto_loc) {
        this.shipto_loc = shipto_loc;
    }
    
}
