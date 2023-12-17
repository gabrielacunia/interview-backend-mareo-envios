/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nssa.envios.controller;

import com.nssa.envios.entities.CustomerEntity;
import com.nssa.envios.services.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers") 
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;
       
    @GetMapping("")
    public  ResponseEntity<List<CustomerEntity>> all(){
        List<CustomerEntity> users = customerService.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
