# Mini Project: Shape Area Calculator

This mini project is a simple **Shape Area Calculator** built using Java's Object-Oriented Programming (OOP) features. It demonstrates how to calculate the area for common shapes like **Triangle**, **Rectangle**, and **Circle** using an abstract class and method overriding.

---

## Features:
- Calculates the area for:
  - **Triangle**
  - **Rectangle**
  - **Circle**
- Demonstrates the use of:
  - **Abstract Classes**
  - **Inheritance**
  - **Method Overriding**
  - **Dynamic Method Dispatch (Polymorphism)**

---

## Area Formulas:
- Triangle → `Area = 0.5 × base × height`
- Rectangle → `Area = length × width`
- Circle → `Area = π × radius²` (π = 3.1416)

---

## Concepts Demonstrated:
- Use of **abstract classes** to define a blueprint for shapes.
- **Inheritance and method overriding** to provide specific area calculation logic for each shape.
- **Dynamic method dispatch** for runtime method binding.
- Proper use of **constructors** and instance variables.

---

## How It Works:
1. The `Shape` abstract class contains an abstract `area()` method.
2. `Triangle`, `Rectangle`, and `Circle` classes extend `Shape` and implement their own `area()` logic.
3. In the `main` method, objects are created using the `Shape` reference, but the correct `area()` method runs based on the actual object type.
4. The program displays the calculated area for each shape.
