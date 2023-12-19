/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nssa.envios.controller;

import com.nssa.envios.entities.ProductEntity;
import com.nssa.envios.entities.TopSellsEntity;
import com.nssa.envios.services.ShippingItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GACUNA
 */
@Controller
@RequestMapping("/reports")
public class ShippingItemController {
  
    
      @Autowired
    private ShippingItemService shippingItemService;
       
//    @GetMapping("/{id}")
//    public ResponseEntity<ShippingItemEntity> getById(@PathVariable Long id) {
//        Optional<ShippingItemEntity>product = shippingItemService.getById(id);
//
//        if (!product.isPresent()) {
//            return new ResponseEntity<>(product.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
    
    @GetMapping("/top-sent")
    public ResponseEntity<List<TopSellsEntity>> getTop3() {
        List<TopSellsEntity> products = shippingItemService.search3TopArt() ; 

        
        if (!products.isEmpty()) {
            return  ResponseEntity.ok(products );
        } else {
            return ResponseEntity.notFound().build();
        }
    
    }
}
