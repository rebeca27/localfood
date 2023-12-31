package com.localfood.exchange.service;

import com.localfood.exchange.exception.ResourceNotFoundException;
import com.localfood.exchange.model.CustomerOrder;
import com.localfood.exchange.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public CustomerOrder createOrder(CustomerOrder order) {
        return orderRepository.save(order);
    }

    public CustomerOrder getOrder(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public CustomerOrder updateOrder(Long id, CustomerOrder orderDetails) {
        CustomerOrder order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found for this id :: " + id));
        order.setOrderDate(orderDetails.getOrderDate());
        order.setDeliveryDate(orderDetails.getDeliveryDate());
        order.setStatus(orderDetails.getStatus());
        order.setTotalAmount(orderDetails.getTotalAmount());
        return orderRepository.save(order);
    }



    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public List<CustomerOrder> getAllOrders() {
        return orderRepository.findAll();
    }

}
