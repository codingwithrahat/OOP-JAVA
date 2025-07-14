# MRMS - Military Resource & Information System

## 📘 Overview

**MRMS** (Military Resource & Information System) is a Java-based console application that simulates basic military personnel management.

This project uses core Java concepts like abstraction, inheritance, and interfaces — and stores soldier data using a **fixed-size array**, simulating a basic **in-memory database**. All functionalities are handled in the console with simple user input/output interfaces.

---

## ✅ Features

- Add new soldiers with rank and corps category
- Assign training and duty to soldiers
- Store and manage personnel data using an in-memory array
- Rank-based salary calculation with bonuses
- Leave management system (default: 10 leaves per person)
- Search soldier info by ID
- View soldier's full profile, duty, training, and salary
- Admin panel (CCU) and User panel (SCU) separation

---

## 🧱 Project Structure

This project follows a modular Java OOP structure with each class in its own file.

### 📁 Folder Structure

```
/src/com/mycompany/mrms/
│
├── Main.java                // Contains main method, runs the program
├── Person.java              // Abstract class, base for all soldier types
├── CO.java                  // Commissioned Officer class
├── JCO.java                 // Junior Commissioned Officer class
├── NCO.java                 // Non-Commissioned Officer class
├── EngineerCorps.java       // CO specialization: Engineers
├── ArtilleryCorps.java      // CO specialization: Artillery
├── MedicalCorps.java        // CO specialization: Medical
├── Trainable.java           // Interface for training assignment
├── Duty.java                // Interface for duty assignment
```

---

## 💾 Database Implementation

This system uses:

```java
static Person[] list = new Person[100];
```

- All soldier data is stored in this array.
- Index tracking is handled using a static variable `i`.
- It's a simple simulation of a database, without file or external storage.

---

## 👥 Soldier Ranks & Categories

### 1. **NCO** – Non-Commissioned Officer  
Ground-level soldiers responsible for executing field operations.
- **Ranks**:
  - Soinik
  - Corporal
  - Sergeant

### 2. **JCO** – Junior Commissioned Officer  
Supervises field units and bridges between COs and NCOs.
- **Ranks**:
  - Junior Warrant Officer
  - Warrant Officer
  - Senior Warrant Officer

### 3. **CO** – Commissioned Officer  
Top-ranking personnel involved in missions, strategy, and operations.
- **Ranks**:
  - Captain
  - Major
  - General

Each CO may also belong to a **special corps**:
- `EngineerCorps` → Mechanical / IT
- `ArtilleryCorps` → Air Defense / Field Artillery
- `MedicalCorps` → Field Physician / Medicine Officer

---

## 🛡️ Functional Modules

### 🧭 Central Command Unit (CCU) – Admin Panel
Only accessible to authorized users (simulated).
- Add new soldiers with rank and corps
- Assign training and duty
- Search soldiers by ID

### 🪖 Soldier Command Unit (SCU) – User Panel
Accessible to individual soldiers via ID.
- View profile and role
- Request 1 or multiple days leave
- View salary (base + corps/rank bonuses)
- View assigned training and duty

---

## 🧠 Key OOP Concepts Used

- ✔️ **Abstraction** → Abstract class `Person`
- ✔️ **Inheritance** → CO, JCO, NCO extend `Person`
- ✔️ **Interfaces** → `Trainable`, `Duty`
- ✔️ **Method Overloading** → `requestLeave()` and `requestLeave(int)`
- ✔️ **Method Overriding** → `calculateSalary()`, `displayRole()`

---

## ▶️ How to Run

### ✅ Requirements
- Java JDK 8 or higher
- IDE like NetBeans / IntelliJ / Eclipse  
- Or terminal

### ▶️ Compile & Run

```bash
javac com/mycompany/mrms/*.java
java com.mycompany.mrms.Main
```

---

## 💡 Future Enhancements

- Replace array with database (e.g., MySQL, SQLite, or file-based storage)
- Add login/authentication
- Implement GUI (JavaFX/Swing)
- Logging and analytics (e.g., total leave granted)
- Add more detailed corps hierarchy

---
