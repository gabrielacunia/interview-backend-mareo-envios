package com.nssa.envios.repositories;

import com.nssa.envios.entities.ShippingEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GACUNA
 */
@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {
    
    Optional<ShippingEntity> findById(Long id);
    
    
}
