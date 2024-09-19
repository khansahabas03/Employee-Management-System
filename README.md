# Employee Management Web Application

## Features

Add Employee: Users can input employee details such as ID, name, designation, and salary, which will be stored in a Oracle database.
View Employee: A table that displays a list of all employees, including their ID, name, designation, and calculated salary components (e.g., HRA, DA).
Remove Employee: Employees can be removed from the list with a confirmation popup and a custom message indicating that the employee’s details have been deleted.
Login System: Users need to log in with a username and password to access the application.

## Technologies Used

Backend: Java Servlets, JSP
Frontend: HTML, CSS
Database: Oracle (with JDBC for database connectivity)
Server: Apache Tomcat

# How to run this Project
## Prerequisites
JDK: Make sure Java Development Kit (JDK) is installed.
Apache Tomcat: Install and configure Apache Tomcat.
Oracle: Set up Oracle or another database compatible with JDBC.
## Steps to Run
Clone the Repository:

git clone https://github.com/khansahabas03/Employee-Management-System.git
Database Setup:

Create a Oracle database named employee_db.
Run the following SQL script to create the Employee61 table:
sql
CREATE TABLE Employee61 (
    ID VARCHAR(10) PRIMARY KEY,
    eName VARCHAR(50),
    eDesg VARCHAR(50),
    bSal FLOAT,
    hra FLOAT,
    da FLOAT,
    totSal FLOAT
);
Configure Database Connection:

Open DBConnection.java and update the database URL, username, and password.
Deploy to Tomcat:

Copy the Employee_Details_App project to the webapps folder of your Tomcat installation.
Start the Tomcat server using the command:

catalina.bat start (Windows)
Access the Application:

Open a web browser and go to:

http://localhost:8080/Employee_Details_App/login.jsp
## Login Credentials:

Username: admin
Password: admin123
