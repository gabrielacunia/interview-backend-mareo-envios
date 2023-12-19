/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nssa.envios.controller;

import com.nssa.envios.entities.CustomerEntity;
import com.nssa.envios.entities.ProductEntity;
import com.nssa.envios.services.ProductService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GACUNA
 */
@Controller
@RequestMapping("/products")
public class ProductController {
  
    
      @Autowired
    private ProductService productService;
       
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getById(@PathVariable Long id) {
        Optional<ProductEntity>product = productService.getById(id);

        if (product.isPresent()) {
            return new ResponseEntity<>(product.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
