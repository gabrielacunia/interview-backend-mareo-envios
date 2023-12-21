package com.nssa.envios;

/**
 *
 * @author GACUNA
 */
public class ShippingPathDTO {
    private String transition;

    public ShippingPathDTO() {
    }

    public String getTransition() {
        return transition;
    }

    public void setTransition(String value) {
        this.transition = value;
    }

    @Override
    public String toString() {
        return "ShippingPathDTO{" + "transition=" + transition + '}';
    }
    
    
}
  
