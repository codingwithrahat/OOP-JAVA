# University Management System 2 (UMS)

This is a **Java console-based University Management System** that models **students**, **undergraduate and postgraduate courses**, and their interactions. It expands upon traditional course registration systems by simulating **course difficulty**, **advisors**, and **thesis topics**, offering a deeper educational structure.

---

## Features

- Define and manage:
  - Undergraduate and Postgraduate Students
  - Undergraduate and Postgraduate Courses
- Course Enrollment & Drop:
  - Undergraduate students can enroll in up to 6 courses
  - Postgraduate students can enroll in up to 4 courses
- View currently enrolled courses
- Calculate and display course difficulty based on:
  - General education requirements (Undergraduate)
  - Research components (Postgraduate)

---

## OOP Concepts Demonstrated

| Concept                     | Description |
|-----------------------------|-------------|
| **Single Inheritance**      | `UndergraduateCourse` and `PostgraduateCourse` inherit from `Course` |
| **Multilevel Inheritance**  | `UndergraduateStudent` → `Student` |
| **Method Overriding**       | `calculateDifficulty()` and `enrollInCourse()` are overridden |
| **Encapsulation**           | Each class contains its own specific fields and methods |
| **Polymorphism**            | Common methods are called through base class references |

---

## Class Structure

- `Course` *(Base Class)*  
  └── `UndergraduateCourse`  
  └── `PostgraduateCourse`

- `Student` *(Base Class)*  
  └── `UndergraduateStudent`  
  └── `PostgraduateStudent`

---

## Notes

- Uses fixed-size arrays to store course lists.
- Demonstrates dynamic array manipulation and simple logic-based difficulty estimation.
- Fully implemented using core Java — no external libraries used.

---
