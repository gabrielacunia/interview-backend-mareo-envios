package com.nssa.envios.entities;

import java.math.BigDecimal;

/**
 *
 * @author GACUNA
 */
public class TopSellsEntity {
 
    private Integer productID;
    private String description;
    private BigDecimal quantity;

    public TopSellsEntity(Integer productID, String description, BigDecimal quantity) {
        this.productID = productID;
        this.description = description;
        this.quantity = quantity;
    }
    
    
    public TopSellsEntity() {
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TopSellsEntity{" + "productID=" + productID + ", description=" + description + ", quantity=" + quantity + '}';
    }

   
}
