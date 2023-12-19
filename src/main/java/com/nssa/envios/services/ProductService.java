package com.nssa.envios.services;

import com.nssa.envios.entities.ProductEntity;
import com.nssa.envios.repositories.ProductRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GACUNA
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository; 
    public Optional<ProductEntity> getById(Long id) {
        return productRepository.findById(id);
    }
}
