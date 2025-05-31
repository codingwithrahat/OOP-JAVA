# Retail Management System – Java OOP Console Project

This project simulates a simple Retail Management System using Java and Object-Oriented Programming (OOP) concepts. It allows the creation and interaction of products, customers, and employees.

---

## Features

- Manage and display product information (ID, name, price)
- Customers can purchase products
- Balance is updated and checked during each purchase
- Employees have roles and positions
- Demonstrates abstraction with abstract classes and interfaces

---

## Classes & Structure

- Product: Represents products with ID, name, and price.
- Person (abstract): Base class for Customer and Employee.
- Customer: Implements Purchasable interface and can purchase products, with balance updated accordingly.
- Employee: Has position and role information.
- Purchasable (interface): Contains the purchase method.

---

## OOP Concepts Used

- Abstraction: Abstract class Person
- Inheritance: Customer and Employee inherit from Person
- Interface: Purchasable implemented by Customer
- Method Overriding: getRole() and purchase() methods
- Encapsulation: Fields like balance, name, and id maintained privately
- Balance Management: Customer’s balance is updated after each purchase inside the purchase() method

---
