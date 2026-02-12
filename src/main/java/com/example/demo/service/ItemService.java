package com.example.demo.service;

import com.example.demo.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    // // In-memory data store (ArrayList)
    // This is where items are actually saved during runtime.
    private final List<Item> items = new ArrayList<>();

    // Adds a new item to the in-memory list
    public Item addItem(Item item) {
        items.add(item);
        return item;
    }

    // Retrieves a single item by its ID
    // Returns null if item not found
    public Item getItemById(int id) {
        return items.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
