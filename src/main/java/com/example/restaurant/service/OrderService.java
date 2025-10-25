package com.example.restaurant.service;

import com.example.restaurant.model.Order;
import com.example.restaurant.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository repo;
    public OrderService(OrderRepository repo){ this.repo = repo; }
    public List<Order> findAll(){ return repo.findAll(); }
    public Optional<Order> find(Long id){ return repo.findById(id); }
    public Order save(Order order){ return repo.save(order); }
}
