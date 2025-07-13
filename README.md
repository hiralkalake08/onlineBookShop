# 📚 Online Book Shop

The *Online Book Shop* is a console-based Java application built using JDBC and PostgreSQL. It allows users to register and log in securely. This project demonstrates how to connect Java with a database using JDBC and structure an interactive command-line program with real-time database operations.

____________________________

## Group information 
Total Members: 2

Hiral Kalake

Narayani Shendge
____________________________

## ⚙️ Technologies Used

This project is built using the following technologies:

▪️ *Java (Core)* – Programming language used to build the application logic.  
▪️ *JDBC (Java Database Connectivity)* – To connect Java code with the PostgreSQL database.  
▪️ *PostgreSQL* – Relational database used to store user data.  
▪️ *Maven* – Build and dependency management tool.  
▪️ *Spring Tool Suite (STS)* or *VS Code* – Used as the IDE for development.

____________________________

## 📌 Features of Online Book Shop (Console-Based)

The application currently includes the following features:

▪️ *User Registration* – New users can register by entering a unique username and password. The data is stored securely in the PostgreSQL users table.  
▪️ *User Login* – Existing users can log in by validating their credentials from the database.  
▪️ *Menu-Driven Interface* – A user-friendly text-based menu provides options to register, log in, or exit the application.  
▪️ *Database Integration* – Uses JDBC to connect to a PostgreSQL database and perform operations.  
▪️ *PreparedStatement Usage* – Prevents SQL injection and ensures safe data handling.  
▪️ *Error Handling* – Handles SQL errors and user input errors gracefully.  
▪️ *Clean Code Structure* – Code is modularized into separate files for logic and database connection.

____________________________

## 🗃️ Database Schema

    CREATE TABLE users (

    id SERIAL PRIMARY KEY,
    
    username VARCHAR(50) UNIQUE NOT NULL,
    
    password VARCHAR(100) NOT NULL
    
    );

    
   
This project uses the following Maven dependencies to run:
 ## 📦 Dependencies

```xml
<dependencies>
    <!-- PostgreSQL JDBC Driver -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.7.1</version>
    </dependency>
</dependencies>
___________________________
```
OUTPUT


<img width="747" height="435" alt="Screenshot (29)" src="https://github.com/user-attachments/assets/939ee2e4-d54f-4efa-8d9c-96b0555c2d05" />
___________________________


### Contact

Name: Hiral Kalake

GitHub: hiralkalake08

Email: hiralkalake08@gmail.com
___________________________











