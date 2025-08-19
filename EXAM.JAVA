1. Hospital Management Systemindex.html (Patient Registration Form)This HTML page provides a simple form for a new patient to register their details. It will have fields for their name, contact information, and date of birth.<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospital Patient Registration</title>
</head>
<body>
    <h1>New Patient Registration</h1>
    <form action="RegisterPatientServlet" method="post">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>
        <label for="contact">Contact:</label><br>
        <input type="text" id="contact" name="contact" required><br><br>
        <label for="dob">Date of Birth:</label><br>
        <input type="date" id="dob" name="dob" required><br><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>

RegisterPatientServlet.java (Servlet)This servlet receives the patient's information from the HTML form and inserts it into the patients table in the MySQL database. It uses JDBC to establish a connection and a PreparedStatement to securely handle the data.import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterPatientServlet")
public class RegisterPatientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        String dob = request.getParameter("dob");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_db", "root", "password");
            
            String sql = "INSERT INTO patients (name, contact, dob) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, contact);
            pstmt.setString(3, dob);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                response.getWriter().println("Patient registered successfully!");
            } else {
                response.getWriter().println("Registration failed.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred: " + e.getMessage());
        }
    }
}

MySQL Database SchemaThis is the SQL code to create the hospital_db database and the patients table for storing patient information.-- Create the database
CREATE DATABASE hospital_db;

-- Use the newly created database
USE hospital_db;

-- Create the patients table
CREATE TABLE patients (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    contact VARCHAR(255),
    dob DATE
);






2. University Course Registrationindex.html (Student Registration)This page allows students to register for an account. It collects their student ID, name, and a password.<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>
</head>
<body>
    <h1>Student Registration</h1>
    <form action="RegisterStudentServlet" method="post">
        <label for="student_id">Student ID:</label><br>
        <input type="text" id="student_id" name="student_id" required><br><br>
        <label for="name">Full Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>


RegisterStudentServlet.java (Servlet)This servlet handles the student registration process. It takes the submitted form data and adds it to the students table in the database.import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterStudentServlet")
public class RegisterStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("student_id");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_db", "root", "password");
            
            String sql = "INSERT INTO students (student_id, name, password) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, studentId);
            pstmt.setString(2, name);
            pstmt.setString(3, password);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                response.getWriter().println("Student registered successfully!");
            } else {
                response.getWriter().println("Registration failed.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("An error occurred: " + e.getMessage());
        }
    }
}

MySQL Database SchemaThis schema creates the university_db database and a students table. A courses table is also included to demonstrate how a second table might be used for course registration later on.-- Create the database
CREATE DATABASE university_db;

-- Use the newly created database
USE university_db;

-- Create the students table
CREATE TABLE students (
    student_id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Create a courses table (for future use)
CREATE TABLE courses (
    course_id VARCHAR(20) PRIMARY KEY,
    course_name VARCHAR(255) NOT NULL,
    credits INT
);

-- Create a student_courses table to link students to courses
CREATE TABLE student_courses (
    student_id VARCHAR(20),
    course_id VARCHAR(20),
    PRIMARY KEY (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);







3. Banking Systemindex.html (Login Page)This page is a simple login form for bank users. It collects a username and password to authenticate the user before allowing access to their account.<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Login</title>
</head>
<body>
    <h1>Bank Login</h1>
    <form action="LoginServlet" method="post">
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>

LoginServlet.java (Servlet)The servlet validates the username and password against the database. If they match, the user is redirected to a "dashboard" or "account" page. Otherwise, an error message is displayed.import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_db", "root", "password");
            
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                response.sendRedirect("dashboard.html"); // Redirect to a dashboard page
            } else {
                out.println("Invalid username or password.");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("An error occurred: " + e.getMessage());
        }
    }
}

MySQL Database SchemaThis schema creates a bank_db database with a users table to store user login credentials and an accounts table to hold the account balance.-- Create the database
CREATE DATABASE bank_db;

-- Use the newly created database
USE bank_db;

-- Create a users table for login
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Create an accounts table to store banking data
CREATE TABLE accounts (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    balance DECIMAL(10, 2) DEFAULT 0.00,
    FOREIGN KEY (user_id) REFERENCES users(id)
);







4. Airline Reservation Systemindex.html (Search Flights)This page allows a user to search for flights by entering their departure and arrival cities, and a travel date.<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flight Search</title>
</head>
<body>
    <h1>Find a Flight</h1>
    <form action="SearchFlightsServlet" method="get">
        <label for="departure">Departure City:</label><br>
        <input type="text" id="departure" name="departure" required><br><br>
        <label for="arrival">Arrival City:</label><br>
        <input type="text" id="arrival" name="arrival" required><br><br>
        <label for="date">Date:</label><br>
        <input type="date" id="date" name="date" required><br><br>
        <input type="submit" value="Search Flights">
    </form>
</body>
</html>


SearchFlightsServlet.java (Servlet)This servlet takes the search criteria and queries the database for available flights. It then displays the results to the user.import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchFlightsServlet")
public class SearchFlightsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String departureCity = request.getParameter("departure");
        String arrivalCity = request.getParameter("arrival");
        String travelDate = request.getParameter("date");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_db", "root", "password");
            
            String sql = "SELECT * FROM flights WHERE departure_city = ? AND arrival_city = ? AND flight_date = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, departureCity);
            pstmt.setString(2, arrivalCity);
            pstmt.setString(3, travelDate);

            ResultSet rs = pstmt.executeQuery();

            out.println("<h1>Available Flights</h1>");
            out.println("<table border='1'>");
            out.println("<tr><th>Flight Number</th><th>Departure Time</th><th>Price</th></tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("flight_number") + "</td>");
                out.println("<td>" + rs.getString("departure_time") + "</td>");
                out.println("<td>" + rs.getString("price") + "</td>");
                out.println("</tr>");
            }
            
            out.println("</table>");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("An error occurred: " + e.getMessage());
        }
    }
}


MySQL Database SchemaThis schema creates a airline_db with a flights table to store flight information and a reservations table to track booked tickets.-- Create the database
CREATE DATABASE airline_db;

-- Use the newly created database
USE airline_db;

-- Create the flights table
CREATE TABLE flights (
    flight_id INT AUTO_INCREMENT PRIMARY KEY,
    flight_number VARCHAR(20) NOT NULL UNIQUE,
    departure_city VARCHAR(255) NOT NULL,
    arrival_city VARCHAR(255) NOT NULL,
    flight_date DATE,
    departure_time TIME,
    price DECIMAL(10, 2)
);

-- Create a reservations table
CREATE TABLE reservations (
    reservation_id INT AUTO_INCREMENT PRIMARY KEY,
    flight_id INT,
    passenger_name VARCHAR(255),
    seat_number VARCHAR(10),
    FOREIGN KEY (flight_id) REFERENCES flights(flight_id)
);
