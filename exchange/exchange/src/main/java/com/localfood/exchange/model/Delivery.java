package com.localfood.exchange.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate deliveryDate;
    private LocalTime deliveryTime;
    private String status;
    private String deliveryAddress;


    @ManyToOne
    @JoinColumn(name = "delivery_person_id")
    private User deliveryPerson;

    @OneToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder customerOrder;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public LocalTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public User getDeliveryPerson() {
        return deliveryPerson;
    }

    public void setDeliveryPerson(User deliveryPerson) {
        this.deliveryPerson = deliveryPerson;
    }

    public CustomerOrder getOrder() {
        return customerOrder;
    }

    public void setOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
}