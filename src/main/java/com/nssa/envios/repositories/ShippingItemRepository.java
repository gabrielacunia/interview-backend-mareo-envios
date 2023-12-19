package com.nssa.envios.repositories;

import com.nssa.envios.entities.ShippingItemEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GACUNA
 */
@Repository
public interface ShippingItemRepository extends JpaRepository<ShippingItemEntity, Integer> {
    
    
     @Query(nativeQuery = true, value ="select product_id, product.description, tabla2.suma  from data.product inner join(select SUM(product_count) as suma, product_id FROM data.shipping_item GROUP BY product_id order by SUM(product_count) desc limit 3)as tabla2 on tabla2.product_id =  data.product.id  order by tabla2.suma desc;")
     List<Object[]> search3TopArt();
    
     
}