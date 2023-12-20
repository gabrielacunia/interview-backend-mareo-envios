package com.nssa.envios.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipping_item")
public class ShippingItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "shipping_id")
    private  ShippingEntity shipping_id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product_id;
    private int product_count;

    public ShippingItemEntity() {
    }

    
    
//    public ShippingItemEntity(int id, int shipping_id, int product_id, int product_count) {
//        this.id = id;
//        this.shipping_id = shipping_id;
//        this.product_id = product_id;
//        this.product_count = product_count;
//    }

    public ShippingItemEntity(int id, ShippingEntity shipping_id, ProductEntity product_id, int product_count) {
        this.id = id;
        this.shipping_id = shipping_id;
        this.product_id = product_id;
        this.product_count = product_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShippingEntity getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(ShippingEntity shipping_id) {
        this.shipping_id = shipping_id;
    }

    public ProductEntity getProduct_id() {
        return product_id;
    }

    public void setProduct_id(ProductEntity product_id) {
        this.product_id = product_id;
    }

    public int getProduct_count() {
        return product_count;
    }

    public void setProduct_count(int product_count) {
        this.product_count = product_count;
    }

    
    

}