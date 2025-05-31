# Ride Management System – Java OOP Console Project

This is a simple **Java-based Ride Management System** that simulates the behavior of different vehicles, drivers, and ride operations. The project demonstrates core **Object-Oriented Programming (OOP)** concepts such as **inheritance**, **interfaces**, and **method overriding**.

---

## Features

- Vehicle types:
  - Car
  - Premium Car
  - Bike
- Driver types:
  - Contract Driver with payment functionality
- Interfaces:
  - `RideInterface` for ride lifecycle (`start_ride`, `end_ride`)
  - `PaymentHandler` for salary/payment logic
- Show car details and luxury features for premium vehicles

---

## OOP Concepts Used

| Concept                 | Description |
|-------------------------|-------------|
| Single Inheritance      | `Car` extends `Vehicle`, `ContractDriver` extends `Driver` |
| Multilevel Inheritance  | `PremiumCar` → `Car` → `Vehicle` |
| Interface Implementation| `Car` and `Bike` implement `RideInterface`, `ContractDriver` implements `PaymentHandler` |
| Method Overriding       | Classes provide specific implementations of `start_ride()`, `end_ride()`, and `calculate_payment()` |
| Encapsulation           | Class fields are grouped logically with related methods |

---

