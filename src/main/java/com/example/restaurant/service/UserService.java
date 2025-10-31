package com.example.restaurant.service;

import com.example.restaurant.model.User;
import com.example.restaurant.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    // Constructor injection (recommended)
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // Find a user by ID
    public Optional<User> find(Long id) {
        return repository.findById(id);
    }

    // Find all users
    public List<User> findAll() {
        return repository.findAll();
    }

    // Save a new user
    public User save(User user) {
        return repository.save(user);
    }

    // Update existing user
    public Optional<User> update(Long id, User user) {
        return repository.findById(id).map(existing -> {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            existing.setPassword(user.getPassword());
            existing.setRole(user.getRole());
            return repository.save(existing);
        });
    }

    // Delete user by ID
    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    // Optional: Find user by email
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email);
    }
}
