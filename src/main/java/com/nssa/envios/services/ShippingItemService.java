package com.nssa.envios.services;

import com.nssa.envios.entities.TopSellsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nssa.envios.repositories.ShippingItemRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author GACUNA
 */
@Service
public class ShippingItemService {
    
    @Autowired
    private ShippingItemRepository shippingItemRepository; 


    public List<TopSellsEntity> search3TopArt() {
        List<Object[]> rawResults = shippingItemRepository.search3TopArt();
        List<TopSellsEntity> processedResults = new ArrayList<>();
        
        for (Object[] result : rawResults) {
            Integer productId = (Integer)result[0];
            String description1 = (String)result[1];
            BigDecimal suma = (BigDecimal)result[2];
            TopSellsEntity objecTemp = new TopSellsEntity(productId, description1, suma);
            processedResults.add(objecTemp);
            System.out.println(Arrays.asList(processedResults));    
         
        }
      
        return processedResults;
    }
 }


