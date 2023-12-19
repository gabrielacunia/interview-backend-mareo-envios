package com.nssa.envios.repositories;

import com.nssa.envios.entities.CustomerEntity;
import com.nssa.envios.entities.ProductEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GACUNA
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    
    Optional<ProductEntity> findById(Long id);
    
    
}
