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

Validation

The API validates student data using Jakarta Bean Validation.

Examples:

Name cannot be empty
Name must contain 2–50 characters
Email must be valid
Age must be between 18 and 60
Course cannot be empty
Exception Handling

The application uses a global exception handler to provide meaningful HTTP responses.

Example:

{
    "error": "Student not found with id: 999"
}
How to Run
1. Clone the repository
git clone <your-repository-url>
2. Create MySQL database
CREATE DATABASE student_db;
3. Configure database password

Set the environment variable:

DB_PASSWORD=your_database_password
4. Run the application
mvn spring-boot:run

The API will be available at:

http://localhost:8080
What I Learned
Building REST APIs with Spring Boot
Layered architecture
Spring Data JPA
Hibernate and MySQL integration
CRUD operations
Request validation
Custom exception handling
Global exception handling
Testing REST APIs with Postman
Managing database configuration securely

### One thing to notice

We intentionally use:

```text
<your-repository-url>





