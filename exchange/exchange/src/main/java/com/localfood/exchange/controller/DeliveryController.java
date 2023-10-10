package com.localfood.exchange.controller;

import com.localfood.exchange.model.Delivery;
import com.localfood.exchange.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localfood/deliveries")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/schedule")
    public Delivery scheduleDelivery(@RequestBody Delivery delivery) {
        return deliveryService.scheduleDelivery(delivery);
    }

    @GetMapping("/{id}")
    public Delivery getDelivery(@PathVariable Long id) {
        return deliveryService.getDelivery(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Delivery> updateDelivery(@PathVariable(value = "id") Long deliveryId,
                                                   @Valid @RequestBody Delivery deliveryDetails) {
        Delivery updatedDelivery = deliveryService.updateDelivery(deliveryId, deliveryDetails);
        return ResponseEntity.ok(updatedDelivery);
    }
}