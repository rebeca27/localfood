package com.localfood.exchange.repository;

import com.localfood.exchange.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
