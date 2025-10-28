package com.example.restaurant.service;

import com.example.restaurant.model.MenuItem;
import com.example.restaurant.repository.MenuItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuItemService {

    private final MenuItemRepository repo;

    public MenuItemService(MenuItemRepository repo) {
        this.repo = repo;
    }

    public List<MenuItem> findAll() {
        return repo.findAll();
    }

    public MenuItem save(MenuItem item) {
        return repo.save(item);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
