# Item Management REST API – Spring Boot

A simple RESTful API built using Spring Boot that manages items using in-memory storage (`ArrayList`).

## Features
- Add a new item (POST /items)
- Retrieve an item by ID (GET /items/{id})
- Input validation using Jakarta Validation
- Proper HTTP status codes

## Running Locally
mvn spring-boot:run  
Runs at: http://localhost:8080

## Testing the Deployed Application

Base URL (Railway example):
https://your-app.up.railway.app

### Add Item
POST /items

Body (JSON):
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming device"
}

### Get Item
GET /items/1

Note: Data is stored in-memory and resets when the server restarts.
