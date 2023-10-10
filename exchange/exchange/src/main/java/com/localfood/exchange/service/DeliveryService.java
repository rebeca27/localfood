package com.localfood.exchange.service;

import com.localfood.exchange.exception.ResourceNotFoundException;
import com.localfood.exchange.model.Delivery;
import com.localfood.exchange.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    public Delivery scheduleDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public Delivery getDelivery(Long id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    public Delivery updateDelivery(Long id, Delivery deliveryDetails) {
        Delivery delivery = deliveryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Delivery not found for this id :: " + id));
        delivery.setDeliveryDate(deliveryDetails.getDeliveryDate());
        delivery.setDeliveryTime(deliveryDetails.getDeliveryTime());
        delivery.setStatus(deliveryDetails.getStatus());
        delivery.setDeliveryAddress(deliveryDetails.getDeliveryAddress());
        return deliveryRepository.save(delivery);
    }

}