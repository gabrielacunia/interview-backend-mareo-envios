package com.nssa.envios.repositories;

import com.nssa.envios.entities.ShippingEntity;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GACUNA
 */
@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Integer> {
    
    Optional<ShippingEntity> findById(int id);
    @Modifying
    @Transactional
    @Query(nativeQuery = true, value ="UPDATE shipping  SET state = :newFieldValue WHERE id = :entityId")
    int updateFieldNameById(@Param("newFieldValue") String newFieldValue, @Param("entityId") int entityId);
    
    
}
