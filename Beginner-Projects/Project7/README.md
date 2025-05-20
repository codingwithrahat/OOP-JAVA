# Animal Food Behavior Simulation

This project is a simple **Animal Food Behavior Simulation** built using **Java**. It demonstrates how to use **inheritance**, **method overriding**, and different types of inheritance like **single**, **multilevel**, and **hierarchical inheritance** in object-oriented programming.

---

## Features

- Two types of animals:
  - **Dog**
  - **Cat**
- Two food classes:
  - **FoodDog**
  - **FoodCat**
- Each animal has:
  - A type (gen)
  - A name
  - A favorite food
- Displays what each animal eats using overridden `eat()` methods

---

## Concepts Used

| Concept                  | Description |
|--------------------------|-------------|
| **Single Inheritance**   | `Dog` and `Cat` inherit directly from `Animal`. |
| **Multilevel Inheritance** | `FoodDog` → `Dog` → `Animal` (same for `FoodCat`). |
| **Hierarchical Inheritance** | `Dog` and `Cat` both extend the common base class `Animal`. |
| **Method Overriding**    | `FoodDog` and `FoodCat` override the `eat()` method to show specific eating behavior. |
| **Encapsulation**        | Each class contains its own fields like name and food. |
| **Polymorphism (optional)** | Can be extended with base class references for runtime method dispatch. |
