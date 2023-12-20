package com.nssa.envios.services;

import com.nssa.envios.entities.ShippingEntity;
import com.nssa.envios.repositories.ShippingRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GACUNA
 */
@Service
public class ShippingService {
    
    @Autowired
    private ShippingRepository shippingRepository; 
    public Optional<ShippingEntity> getById(Long id) {
        return shippingRepository.findById(id);
    }
    

    public void updateFieldName(Long entityId, String newFieldValue) {
        shippingRepository.updateFieldNameById(newFieldValue, entityId);
    }
}
