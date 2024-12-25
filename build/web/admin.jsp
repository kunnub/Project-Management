<%-- 
    Document   : admin
    Created on : Nov 9, 2024, 10:27:24 PM
    Author     : HP
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Dashboard</title>
        <link rel="stylesheet" href="admin.css">
        <!-- Add Font Awesome for icons -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
    </head>
    <body>
        <!-- Navigation Bar -->

        <nav class="navbar">
            <div class="logo"><img src="./assets/images/logo2.svg" alt="logo" width="60%"/>
            </div>
            <ul>
                <li><a href="admin.jsp">Home</a></li>
                <li><a href="#">Account</a></li>
                <li><a href="LogOut.jsp">Log Out</a></li>
            </ul>
        </nav>

        <%
            session = request.getSession();  // Get session without creating a new one
            System.out.println(session);
            if (session == null || session.getAttribute("role") == null || !session.getAttribute("role").equals("admin")) {
                // Redirect to login page if not authenticated or not an admin
                response.sendRedirect("registration.html");
            }
        %>


        <!-- Admin Dashboard Content -->
        <h1>Welcome Admin!!</h1>
        <div class="dashboard-links">
            <a href="./FetchProjectDetails"><i class="fas fa-tasks"></i> Manage Projects</a>
            <a href="./FetchUserData"><i class="fas fa-users"></i> Manage Clients</a>
            <a href="./FetchContactDetails"><i class="fas fa-envelope"></i> View Contact Submissions</a>
            <a href="./FetchSubscriptions"><i class="fas fa-newspaper"></i> Manage Newsletter Subscriptions</a>
        </div>

        <!-- Footer -->
        <footer>
            <p>&copy; 2024 Project Management System. All Rights Reserved.</p>
        </footer>
    </body>

</html>
