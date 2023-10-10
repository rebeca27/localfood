package com.localfood.exchange.controller;

import com.localfood.exchange.model.Order;
import com.localfood.exchange.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localfood/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable(value = "id") Long orderId,
                                             @Valid @RequestBody Order orderDetails) {
        Order updatedOrder = orderService.updateOrder(orderId, orderDetails);
        return ResponseEntity.ok(updatedOrder);
    }
}
