# Project and Client Management Web Application

A comprehensive web application to manage clients, projects, contact form submissions, and newsletter subscriptions. This project is designed to provide a streamlined and user-friendly interface for project and client management, with an admin panel for centralized control.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Screenshots](#screenshots)
- [Setup Instructions](#setup-instructions)
---

## Overview

This Project and Client Management Web Application is a full-stack solution developed using Java technologies. It includes a landing page and an admin panel to manage various functionalities such as clients, projects, contact form submissions, and newsletter subscriptions. The application is responsive and ensures seamless operation across devices.

---

## Features

- **Client Management**: Add, update, and delete client details.
- **Project Management**: Create, edit, and remove projects linked to clients.
- **Contact Form Submissions**: View and manage user messages submitted via the contact form.
- **Newsletter Subscriptions**: Track and handle newsletter sign-ups.
- **Admin Panel**: A secure interface for administrators to manage the application.
- **Responsive Design**: Fully optimized for desktops, tablets, and mobile devices.

---

## Tech Stack

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java, JSP, Servlets
- **Database**: MySQL
- **Connectivity**: JDBC
- **Server**: Apache Tomcat

---

# Project Management System  

A comprehensive web-based application designed to manage projects, clients, and subscriptions efficiently. Built using **Java**, **JSP**, **Servlets**, **JDBC**, and **MySQL**, this system allows administrators to handle various project-related operations via an intuitive admin panel.  


### Screenshots

## Home Pages
  <!-- Left Column (Two Images Stacked) -->
  <div style="display: flex; flex-direction: column; align-items: center; gap: 20px;">
    <img src="https://github.com/kunnub/Project-Management/blob/master/web/assets/readmeImg/home1.png" alt="Landing Page" width="500">
    <img src="https://github.com/kunnub/Project-Management/blob/master/web/assets/readmeImg/projects.png" alt="Projects" width="500">
  </div>

  <!-- Center Image -->
  <div style="display: block; width:400%">
    <img src="https://github.com/kunnub/Project-Management/blob/master/web/assets/readmeImg/Spage.png" alt="Static page" height="550"  style="display:flex;">
  </div>

## Admin Panel
<div style="display: flex; justify-content: center; gap: 20px; margin-top: 20px;">
  <img src="https://github.com/kunnub/Project-Management/blob/master/web/assets/readmeImg/projectMangement.png" alt="Projects" width="500">   
  <img src="https://github.com/kunnub/Project-Management/blob/master/web/assets/readmeImg/adminPanel.png" alt="Admin Panel" width="500">
</div>

---

## Setup Instructions

Follow these steps to set up and run the application on your local machine:

### 1. Clone the Repository
Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/kunnub/Project-Management.git
```


### 2. Set Up the MySQL Database

1. Open your MySQL client or MySQL Workbench.
2. Create a new database named `project_management`: and create the tables using the provided sql queries
```sql
-- Create Database
CREATE DATABASE project_management;

-- Use the created database
USE project_management;

-- Create Clients Table
CREATE TABLE clients (...);

-- Create Projects Table
CREATE TABLE projects (...);

-- Create Contact Form Submissions Table
CREATE TABLE contact_form (...);

-- Create Newsletter Subscriptions Table
CREATE TABLE subscriptions (...);

```

### 3. Configure Database Connection
```sql
db.url=jdbc:mysql://localhost:3306/project_management
db.username=your_mysql_username
db.password=your_mysql_password
```
## Usage

### Admin Panel

1. Log in to the admin panel with the default credentials:
   - **Username**: `admin`
   - **Password**: `password`  
     *(It is highly recommended to change these credentials after the first login.)*

2. Use the admin panel to:
   - Manage clients and projects.
   - View contact form submissions.
   - Monitor newsletter subscriptions.

### Contact
For any queries or suggestions, feel free to contact me:

-E-mail: <a href="mailto:kunalbobde19@gmail.com">Mail Me</a>         
-GitHub Profile: <a href="https://github.com/kunnub" >GitHub</a>

