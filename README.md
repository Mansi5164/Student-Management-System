# 📚 Student-Management-System (Spring Boot)

A backend application built using Spring Boot that manages student data with clean architecture and strong validation rules.

🚀 Features
Core CRUD Operations

Add new students

Update student details

Get student by ID

Get all students

Delete students

🔐 Advanced Validation (DTO Level)

Using Jakarta Validation + custom annotations:

@NotBlank, @Size, @Email, @Digits, @Min, @Max

@PrimeNumberValidation – ensures age is a prime number

@StudentRoleValidation – validates allowed roles (ADMIN/USER)

⚠️ Exception Handling

Centralized exception handling for:

ResourceNotFoundException

Validation errors (MethodArgumentNotValidException)

Custom business exceptions

Invalid data format errors

🏗️ Tech Stack

Java 17+

Spring Boot

Lombok

Maven

MySQL / PostgreSQL

📂 Project Structure
src/main/java/com/student_management_system
│
├── controller/       
├── service/          
├── repository/       
├── dto/              
├── annotation/       
├── exception/        
└── entity/          

🔮 Upcoming Features

Pagination & sorting

Search & filters

Role-based security (Spring Security)

More custom validators

Frontend UI integration
