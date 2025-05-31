# University Management System (UMS)

This is a **Java console-based University Management System** that simulates core entities in a university such as **students**, **teachers**, and **graduate students**. It demonstrates multiple core object-oriented programming (OOP) concepts including **inheritance**, **interfaces**, **method overriding**, and **polymorphism**.

---

## Features

- Create and manage:
  - Students
  - Graduate Students
  - Teachers
- Interfaces:
  - `Employee` for salaried entities
  - `CourseParticipant` for entities that can enroll in courses
- Student and Teacher course enrollment
- Method overriding for customized information display
- Salary display for teachers

---

## OOP Concepts Demonstrated

| Concept                 | Description |
|-------------------------|-------------|
| **Single Inheritance**  | `Student` and `Teacher` inherit from `Person` |
| **Multilevel Inheritance** | `GraduateStudent` → `Student` → `Person` |
| **Hierarchical Inheritance** | `Student` and `Teacher` both extend `Person` |
| **Interface Implementation** | `Teacher` implements both `Employee` and `CourseParticipant`; `Student` implements `CourseParticipant` |
| **Method Overriding**   | `show_info()` is overridden in `Student`, `Teacher`, and `GraduateStudent` |
| **Encapsulation**       | Each class has its own specific fields and methods |

---

