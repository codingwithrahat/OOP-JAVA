# Bank Account Interest Calculator

This project is a simple **Bank Account Interest Calculator** built using **Java**. It demonstrates how to use **abstract classes**, **inheritance**, **method overriding**, and **polymorphism** to model different types of bank accounts and calculate interest accordingly.

---

## Features

- Two types of accounts:
  - **SavingAccount**
  - **FixedAccount**
- Calculates interest using:
  - Default interest rate
  - Custom interest rate (method overloading)
- Showcases Java OOP concepts:
  - Abstract classes
  - Inheritance
  - Constructor overloading
  - Method overriding
  - Polymorphism (dynamic method dispatch)

---

## 📘 Concepts Used

| Concept             | Description |
|---------------------|-------------|
| **Abstract Class**  | `Account` defines the blueprint for all accounts with an abstract `calculateInterest()` method. |
| **Inheritance**     | `SavingAccount` and `FixedAccount` extend `Account`. |
| **Method Overriding** | Both account types override `calculateInterest()` to provide specific interest logic. |
| **Method Overloading** | Both classes provide a version of `calculateInterest(double customRate)`. |
| **Dynamic Method Dispatch** | Base class reference used to call overridden methods at runtime. |

---

## Interest Formulas

- **SavingAccount**:  
  `Interest = balance × interestRate`

- **FixedAccount**:  
  `Interest = balance × interestRate × (depositPeriod / 12)`
