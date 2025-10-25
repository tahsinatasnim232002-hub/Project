package com.example.restaurant.model;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity;
    private double unitPrice;
    private double subtotal;
    @ManyToOne @JoinColumn(name="order_id")
    private Order order;
    // getters & setters
}
