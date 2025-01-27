/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nssa.envios.controller;

import com.nssa.envios.ShippingPathDTO;
import com.nssa.envios.entities.ShippingEntity;
import com.nssa.envios.services.ShippingService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author GACUNA
 */
@Controller
@RequestMapping("/shippings")
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @GetMapping("/{id}")
    public ResponseEntity<ShippingEntity> getById(@PathVariable int id) {
        Optional<ShippingEntity> shipping = shippingService.getById(id);

        if (shipping.isPresent()) {
            return new ResponseEntity<>(shipping.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> updateField(@PathVariable int id, @RequestBody ShippingPathDTO body) {
      
        try {
            String currentState = shippingService.getById(id).get().getState();
           

            if ((currentState.equalsIgnoreCase("Inicial") && (body.getTransition().equalsIgnoreCase("cancelado") || body.getTransition().equalsIgnoreCase("Entregado al correo")))
                    || (currentState.equalsIgnoreCase("Entregado al correo") && (body.getTransition().equalsIgnoreCase("cancelado") || body.getTransition().equalsIgnoreCase("En camino")))
                    || (currentState.equalsIgnoreCase("En camino") && body.getTransition().equalsIgnoreCase("Entregado"))) {
                shippingService.updateState(id, body.getTransition());       
                return ResponseEntity.ok("Campo actualizado exitosamente");
            } else {
                return ResponseEntity.badRequest().body("Operación no permitida para el estado actual: " + currentState);
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al actualizar el campo: " + e.getMessage());
        }
           

}
}