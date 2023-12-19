Project Overview

This Task Management API is designed to allow users to manage their tasks effectively with features to create, retrieve, update, and delete tasks. It supports user authentication and provides admin users with extended privileges.

Technologies Used
Backend: Java with Spring Boot
Database: MySQL
API Testing: Postman
Version Control: Git

Features
User Authentication: Secure user registration and login system.
CRUD Operations: Users can create, read, update, and delete tasks.
Admin Functions: Admin users have the ability to access and modify all tasks. (Note: This functionality is planned but not yet implemented.)

Endpoints
User Registration: POST /api/users/register
User Login: POST /api/users/login
Create Task: POST /api/tasks
List Tasks: GET /api/tasks
Get Task: GET /api/tasks/{id}
Update Task: PUT /api/tasks/{id}
Delete Task: DELETE /api/tasks/{id}


Setup and Installation
Install Java JDK 11 or higher.
Install MySQL and set up the database using the provided schema.
Build and run the application using Maven: mvn spring-boot:run.

Running the API
Start the application through your IDE or the command line.
The API is hosted at http://localhost:8080/.
Use Postman or any other API testing tool to interact with the API endpoints.
