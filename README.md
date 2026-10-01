# Student Management System API

A RESTful Student Management System API built using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Features

- Add Student
- Get All Students
- Get Student by ID
- Update Student
- Delete Student
- Request Validation
- Global Exception Handling
- Custom Student Not Found Exception
- MySQL Database Integration
- Layered Architecture
- RESTful APIs

## Technologies Used

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman
- IntelliJ IDEA
- Git & GitHub

## Project Architecture

Controller → Service → Repository → MySQL

### Controller

Handles HTTP requests and responses.

### Service

Contains application/business logic.

### Repository

Communicates with the database using Spring Data JPA.

### Exception

Handles application exceptions and validation errors.

### Model

Contains the Student entity.

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/students` | Add a student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

## Example Request

### Add Student

```json
{
    "name": "Rahul Sharma",
    "email": "rahul@gmail.com",
    "age": 22,
    "course": "Java"
}   


