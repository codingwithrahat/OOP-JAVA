# Mini Project: Shape Area Calculator

This mini project is a simple **Shape Area Calculator** that demonstrates calculating the area for two geometric shapes: **Triangle** and **Rectangle** using core **Object-Oriented Programming (OOP)** principles in Java.

The program highlights the use of **inheritance**, **method overriding**, and **dynamic method dispatch** to compute and display the area of different shapes.

---

## Features:
- Calculate the area of a **Triangle**.
- Calculate the area of a **Rectangle**.
- Demonstrates **polymorphism** using parent class references.

---

## Concepts Demonstrated:
- **Inheritance** — defining a shared `Shape` superclass.
- **Method Overriding** — child classes redefine the `area()` method.
- **Dynamic Method Dispatch** — runtime decision of which `area()` version to call.
- Basic Java syntax and object-oriented design.

---

## How It Works:
- The `Shape` class declares a method `area()` returning `0` by default.
- `Triangle` and `Rectangle` classes extend `Shape` and override the `area()` method for their own area formulas.
- In the `main()` method, parent class references (`Shape`) point to child class objects (`Triangle` and `Rectangle`), and Java resolves the correct method at **runtime**.
- The program prints the calculated area for both shapes on the console.

