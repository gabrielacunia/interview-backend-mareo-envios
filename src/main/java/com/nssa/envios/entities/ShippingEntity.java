package com.nssa.envios.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "shipping")
public class ShippingEntity {

    @Id
    private int id;
    private int customer_id;
    private String state;
    private Date send_date;
    private Date arrive_date;
    private int priority;

    public ShippingEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getSend_date() {
        return send_date;
    }

    public void setSend_date(Date send_date) {
        this.send_date = send_date;
    }

    public Date getArrive_date() {
        return arrive_date;
    }

    public void setArrive_date(Date arrive_date) {
        this.arrive_date = arrive_date;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

   
    
   
}
