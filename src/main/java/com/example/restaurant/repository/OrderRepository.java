package com.example.restaurant.repository;

import com.example.restaurant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Optional: You can add custom queries if needed, e.g.:
    // List<Order> findByStatus(String status);
}
