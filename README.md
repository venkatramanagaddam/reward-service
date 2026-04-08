
# 🧾 Reward Program API (Spring Boot)

## 📌 Overview
This project implements a **Reward Points System** for a retail customer based on transaction history.

Customers earn:
- **2 points** for every dollar spent over $100
- **1 point** for every dollar spent between $50 and $100

The system calculates:
- Monthly reward points
- Total reward points
- Based on a **rolling 3-month period (dynamic)**

---

## 🚀 Features

✅ RESTful APIs (GET + POST)  
✅ Dynamic 3-month calculation (no hardcoding)  
✅ H2 in-memory database  
✅ DTO-based architecture (clean separation)  
✅ Input validation (`@Valid`)  
✅ Global exception handling  
✅ Unit + Integration tests  
✅ Preloaded sample data  

---

## 🏗️ Project Structure

```
com.example.rewards
│
├── controller     → REST APIs
├── service        → Business logic
├── repository     → DB access
├── entity         → DB models
├── dto            → API request/response models
├── exception      → Global exception handling
├── util           → Reward calculation logic
├── config         → Data loader
```

---

## ⚙️ Tech Stack

- Java 17  
- Spring Boot 3  
- Spring Data JPA  
- H2 Database  
- JUnit 5 / MockMvc  

---

## 📊 Reward Calculation Logic

Example:

| Amount | Calculation | Points |
|--------|------------|--------|
| $120   | 2×20 + 1×50 | 90 |
| $75    | 1×25        | 25 |
| $40    | 0           | 0 |

---

## 📡 APIs

### 🔹 Get Rewards
GET /api/rewards/{customerId}

### 🔹 Add Transaction
POST /api/rewards/transaction

---

## ▶️ How to Run

mvn clean install  
mvn spring-boot:run  

---

## 👨‍💻 Author
Spring Boot Reward Assignment
