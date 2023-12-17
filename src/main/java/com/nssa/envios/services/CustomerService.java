/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nssa.envios.services;

import com.nssa.envios.entities.CustomerEntity;
import com.nssa.envios.repositories.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GACUNA
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository clientRepository;

    public List<CustomerEntity> getAll() {
        return clientRepository.findAll();
    }
}
