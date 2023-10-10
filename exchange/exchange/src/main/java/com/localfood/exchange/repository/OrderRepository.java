package com.localfood.exchange.repository;

import com.localfood.exchange.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
    List<CustomerOrder> findByStatus(String status);
    List<CustomerOrder> findByOrderDate(LocalDate orderDate);
    List<CustomerOrder> findByDeliveryDate(LocalDate deliveryDate);
}

