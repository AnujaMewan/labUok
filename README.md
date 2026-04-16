# labuok — University Staff Payment System

A Java OOP lab project (Lab 04) that models a university staff payment system using **inheritance**, **abstraction**, **encapsulation**, and **polymorphism**.

---

## Project Structure

```
labuok/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/mycompany/labuok/
                ├── Lab04Main.java          # Entry point
                ├── StaffMember.java        # Abstract base class
                ├── Lecturer.java           # Extends StaffMember
                ├── LabAssistant.java       # Extends StaffMember
                └── UniversityPolicy.java   # Final utility class
```

---

## Classes Overview

### `StaffMember` (Abstract)
The base class for all university staff.

| Member | Type | Description |
|--------|------|-------------|
| `fullname` | `private String` | Staff member's full name |
| `staffId` | `private final String` | Unique staff ID (immutable) |
| `department` | `protected String` | Department name |
| `staffCount` | `private static int` | Tracks total number of staff created |

**Key methods:**
- `calculateMonthlyPayment()` — abstract; implemented by each subclass
- `displayBasicDetails()` — final; prints name, ID, and department
- `showCommonNotice()` — final; prints a policy reminder
- `changeDepartment(String)` — updates department with null/empty validation
- `getStaffCount()` — static; returns total staff created
- `showSystemName()` — static; prints the system title

---

### `Lecturer` (extends `StaffMember`)
Represents a lecturer paid per course.

| Attribute | Type | Description |
|-----------|------|-------------|
| `courseCount` | `private int` | Number of courses taught |
| `paymentPerCourse` | `private double` | Payment rate per course |

**Payment formula:** `courseCount × paymentPerCourse`

---

### `LabAssistant` (extends `StaffMember`)
Represents a lab assistant paid by the hour.

| Attribute | Type | Description |
|-----------|------|-------------|
| `hoursWorked` | `private int` | Total hours worked |
| `hourlyRate` | `private double` | Hourly pay rate |

**Payment formula:** `hoursWorked × hourlyRate`

---

### `UniversityPolicy` (Final)
A utility class holding university-wide constants and helper methods.

| Member | Description |
|--------|-------------|
| `UNIVERSITY_NAME` | `"University Of Kelaniya"` |
| `BONUS_RATE` | `0.10` (10%) |
| `showPolicyHeader()` | Prints the payment policy header |
| `calculateBonus(double)` | Returns 10% bonus on a given payment |

---

## How to Build & Run

### Prerequisites
- Java 25+
- Apache Maven

### Build
```bash
mvn compile
```

### Run
```bash
mvn exec:java -Dexec.mainClass="com.mycompany.labuok.Lab04Main"
```

### Expected Output
```
University Staff Payment System

-- University Payment Policy --

Name: Kasun
StaffID: L001
Department: IT
No of Courses: 3
Payment per Course: 50000.0
Monthly Payment: 150000.0

Name: Dasun
StaffID: L002
Department: IT          ← department changed from Physics → IT
No of Courses: 2
Payment per Course: 65000.0
Monthly Payment: 130000.0

Name: Nisal
StaffID: A001
Department: CS
No of Hours Worked: 100
Hourly Rate: 500.0
Monthly Payment: 50000.0

Total Monthly Payment: 330000.0
Total Staff: 3
Staff Members must follow university policies.
Staff Members must follow university policies.
Staff Members must follow university policies.
```

---

## OOP Concepts Demonstrated

| Concept | Where Used |
|---------|------------|
| **Abstraction** | `StaffMember` is abstract; `calculateMonthlyPayment()` is abstract |
| **Inheritance** | `Lecturer` and `LabAssistant` both extend `StaffMember` |
| **Encapsulation** | Private fields with public getters; `staffId` is `final` |
| **Polymorphism** | `calculateMonthlyPayment()` behaves differently per subclass |
| **Static members** | `staffCount` tracks all instances; `showSystemName()` is shared |
| **Final members** | `staffId` field; `displayBasicDetails()` and `showCommonNotice()` methods; `UniversityPolicy` class |

---

## Notes

- `staffCount` is `static` because it is shared across all instances — it counts the total number of staff objects created, not a per-object value.
- `changeDepartment()` is used instead of direct field access to enforce validation logic and controlled modification of data.
- `department` is `protected` (not `private`) so subclasses like `LabAssistant` can access it directly if needed.
