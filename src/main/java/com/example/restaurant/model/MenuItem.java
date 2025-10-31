 package com.example.restaurant.model;

import jakarta.persistence.*;

@Entity
@Table(name = "menu_items")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private boolean available;
    private String imageUrl;

    // Default constructor
    public MenuItem() {
    }

    // Convenience constructor
    public MenuItem(String name, String description, double price, boolean available, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
        this.imageUrl = imageUrl;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    // <-- এখানে ঠিকভাবে setId করা হয়েছে -->
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", available=" + available +
                '}';
    }
}
