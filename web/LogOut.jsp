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
            session.invalidate();
            response.sendRedirect("displayProjectsHome");
        %>
    </body>
</html>
