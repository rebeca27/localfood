package com.localfood.exchange.repository;

import com.localfood.exchange.model.CustomerOrder;
import com.localfood.exchange.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
    List<Delivery> findByDeliveryDate(LocalDate deliveryDate);
    List<CustomerOrder> findByStatus(String status);
}

