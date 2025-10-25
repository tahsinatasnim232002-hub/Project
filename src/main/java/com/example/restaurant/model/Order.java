package com.example.restaurant.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int tableNumber;
    private String status;
    private double total;
    private double tax;
    @OneToMany(mappedBy="order", cascade=CascadeType.ALL)
    private List<OrderItem> items;
    // getters & setters
}
