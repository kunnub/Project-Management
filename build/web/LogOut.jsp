<%-- 
    Document   : LogOut
    Created on : Dec 18, 2024, 2:52:44 PM
    Author     : HP
--%>

<%@page import="com.mysql.cj.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogOut page</title>
    </head>
    <body>
        <%
<<<<<<< HEAD
            session.invalidate();
            response.sendRedirect("displayProjectsHome");
        %>
=======
       session.invalidate();
       response.sendRedirect("registration.html");
       %>
>>>>>>> 259ff45806a07ac69aaebc4fbf7bb0dc1ff7a989
    </body>
</html>
