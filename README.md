# 📚 Student-Management-System (Spring Boot)

A backend application built using Spring Boot that manages student data with clean architecture, layered design, and strong validation rules.
This project focuses on writing production-grade REST APIs with DTO validation, custom annotations, and centralized exception handling.

🚀 Features

✅ Core CRUD Operations
Add new students
Update student details
Get student by ID
Get all students
Delete students

🔐 Advanced Validation (DTO Level)
Using Jakarta Validation + custom annotations:
@NotBlank, @Size, @Email, @Digits, @Min, @Max
Custom Annotation: @PrimeNumberValidation
Ensures the student’s age is a prime number.
Custom Annotation: @StudentRoleValidation
Restricts role values to supported roles (e.g., ADMIN, USER).

⚠️ Exception Handling
Centralized and consistent handling for:
ResourceNotFoundException
Validation errors (MethodArgumentNotValidException)
Custom business logic exceptions
Invalid data format & other runtime errors
Helps produce meaningful JSON error responses.

🏗️ Tech Stack
Java 17+
Spring Boot (Web, Validation)
Lombok
Maven
MySQL / PostgreSQL (optional)

📂 Project Structure
src/main/java/com/student_management_system
│
├── controller/       → REST APIs
├── service/          → Business logic
├── repository/       → JPA repositories
├── dto/              → Data Transfer Objects with validations
├── annotation/       → Custom validation annotations
├── exception/        → Central exception handling
└── entity/           → JPA entity classes

🔮 Upcoming Features
Pagination & sorting
Search/filter endpoints
Authentication & authorization (Spring Security)
More custom validators

UI integration (React/Angular)
