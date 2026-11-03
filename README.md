# 🏨 KIET Hostel Management System

A RESTful API-based Hostel Management System developed using **Spring Boot, Spring Data JPA, and MySQL**. This project manages hostel student accommodation records and provides CRUD (Create, Read, Update, Delete) operations.

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA
- Postman

## 📌 Project Features

- Add new hostel student records.
- Retrieve all hostel students.
- Retrieve a student by ID.
- Update student details.
- Delete hostel student records.
- Automatically generate database tables using Hibernate.

## 🗄️ Database Structure

**Database Name:** `hostel_db`

**Table Name:** `hostel_student`

| Column | Data Type | Description |
|---|---|---|
| id | INT | Primary Key, Auto Generated |
| studentName | VARCHAR(100) | Student Name |
| rollNumber | VARCHAR(20) | Student Roll Number |
| hostelName | VARCHAR(50) | Hostel Name |
| roomNumber | VARCHAR(20) | Room Number |
| fee | DOUBLE | Hostel Fee |

## 🔗 REST API Endpoints

Base URL: `http://localhost:8080/students`

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Add a new student |
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve student by ID |
| PUT | `/students/{id}` | Update student details |
| DELETE | `/students/{id}` | Delete student by ID |

## 📥 Sample JSON Request

```json
{
  "studentName": "Vipin",
  "rollNumber": "240001",
  "hostelName": "Boys Hostel",
  "roomNumber": "A-101",
  "fee": 85000.0
}
```

## ⚙️ Database Configuration

Create the MySQL database:

```sql
CREATE DATABASE hostel_db;
```

Configure `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hostel_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace `YOUR_PASSWORD` with your MySQL password.

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

2. Open the project in IntelliJ IDEA.

3. Configure MySQL credentials in `application.properties`.

4. Create the `hostel_db` database in MySQL.

5. Allow Maven to download dependencies.

6. Run the main Spring Boot application.

7. Test the REST APIs using Postman.

## 🧪 Testing

All five CRUD operations were successfully implemented and tested using Postman.

## 👨‍💻 Developer

**Vipin**

B.Tech – Computer Science and Engineering (AI & ML)

KIET Group of Institutions

---

⭐ If you find this project useful, feel free to explore the repository!
