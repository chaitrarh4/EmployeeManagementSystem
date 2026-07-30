# Employee Management System

A Java-based Employee Management System developed using **Hibernate ORM**, **MySQL**, and **Maven**. This project demonstrates CRUD operations and Hibernate entity relationships.

---

## 🚀 Technologies Used

- Java 17
- Hibernate ORM
- MySQL
- Maven
- Eclipse IDE

---

## 📌 Features

- Employee CRUD Operations
- Department CRUD Operations
- Address CRUD Operations
- Project CRUD Operations
- One-to-One Mapping (Employee ↔ Address)
- Many-to-One Mapping (Employee → Department)
- One-to-Many Mapping (Department → Employees)
- Many-to-Many Mapping (Employee ↔ Project)
- Hibernate Annotations
- MySQL Database Integration

---

## 📂 Project Structure

```
EmployeeManagement/
│── src/main/java
│   ├── com.employee.entity
│   │   ├── Employee.java
│   │   ├── Department.java
│   │   ├── Address.java
│   │   └── Project.java
│   │
│   ├── com.employee.dao
│   │   ├── EmployeeDAO.java
│   │   ├── DepartmentDAO.java
│   │   ├── AddressDAO.java
│   │   └── ProjectDAO.java
│   │
│   ├── com.employee.main
│   │   └── Main.java
│   │
│   └── com.employee.util
│
├── src/main/resources
│   └── hibernate.cfg.xml
│
└── pom.xml
```

---

## 🗄️ Database

Database Name:

```
employee_db
```

Hibernate automatically creates the required tables.

---

## 🗃️ Entity Relationships

- **Department ↔ Employee**
  - One Department has Many Employees
  - Many Employees belong to One Department

- **Employee ↔ Address**
  - One-to-One Relationship

- **Employee ↔ Project**
  - Many-to-Many Relationship

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/chaitrarh4/EmployeeManagementSystem.git
```

2. Open the project in Eclipse.

3. Create a MySQL database:

```
CREATE DATABASE employee_db;
```

4. Update the database credentials in `hibernate.cfg.xml`.

5. Run `Main.java`.

---

## 📷 Output

The application performs CRUD operations using Hibernate and prints the results in the console.

---

## 👩‍💻 Author

**Chaitra R H**

- GitHub: https://github.com/chaitrarh4

---
OUTPUT
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/62450a5c-0c13-4da5-bf4d-1c5a271e7e7f" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/796616ba-2f83-4f0c-a161-aeca2e6798bd" />
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/de3535c9-83e1-45c0-acdd-964a82f8b12e" />


## 📄 License

This project is created for learning and educational purposes.
