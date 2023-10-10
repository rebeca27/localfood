package com.localfood.exchange.controller;

import com.localfood.exchange.model.CustomerOrder;
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
    public CustomerOrder createOrder(@RequestBody CustomerOrder order) {
        return orderService.createOrder(order);
    }

    @GetMapping("/{id}")
    public CustomerOrder getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CustomerOrder> updateOrder(@PathVariable(value = "id") Long orderId,
                                             @Valid @RequestBody CustomerOrder orderDetails) {
        CustomerOrder updatedOrder = orderService.updateOrder(orderId, orderDetails);
        return ResponseEntity.ok(updatedOrder);
    }
}
