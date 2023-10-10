package com.localfood.exchange.repository;

import com.localfood.exchange.model.Delivery;
import com.localfood.exchange.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatus(String status);
    List<Delivery> findByDate(Date date);
}
