package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    // POST /items
    // Adds a new item to the system
    // Uses @Valid to trigger input validation
    @PostMapping
    public ResponseEntity<?> addItem(@Valid @RequestBody Item item) {
        return ResponseEntity.ok(service.addItem(item));
    }

    // GET /items/{id}
    // Fetches an item by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable int id) {
        Item item = service.getItemById(id);

        if (item == null) {
            return ResponseEntity.status(404).body("Item not found");
        }

        return ResponseEntity.ok(item);
    }
}
