# Item Management REST API – Spring Boot

## Overview

A simple RESTful API built using Spring Boot that manages items using in-memory storage (`ArrayList`).

The API supports:
- Adding a new item
- Retrieving an item by ID

---

## Live Deployment

Base URL:
https://java-backend-task-production.up.railway.app

---

## API Endpoints

### 1️⃣ Add Item

POST /items

URL:
https://java-backend-task-production.up.railway.app/items

Request Body (JSON):

{
  "id": 1,
  "name": "Phone",
  "description": "Flagship device"
}

Validation:
- id → required, must be greater than 0  
- name → required, 3–50 characters  
- description → optional, max 200 characters  

---

### 2️⃣ Get Item by ID

GET /items/{id}

Example:
https://java-backend-task-production.up.railway.app/items/1

Responses:
- 200 OK → Item found  
- 404 Not Found → Item not found  

---

## Run Locally

mvn spring-boot:run

Runs at:
http://localhost:8080

---

Note: Data is stored in-memory and resets when the server restarts.

---

Author: Ayush Kumar
