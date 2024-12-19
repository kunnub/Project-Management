<%-- 
    Document   : clients
    Created on : Nov 9, 2024, 10:28:20 PM
    Author     : HP
--%>

<%@page import="java.util.List"%>
<%@page import="model.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Client Management</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
    </head>
    <body>       
<jsp:include page="./AdminNavbar.jsp" />

        <h1>Client Management</h1>
        <table>
            <tr>
                <th>Client Id</th>
                <th>Client Name</th>
                <th>Client Email</th>
            </tr>
            <%
                List<model.Users> jspUserList = (List<model.Users>) request.getAttribute("userList");

                if (jspUserList != null && !jspUserList.isEmpty()) {
                    for (Users user : jspUserList) {
            %>
            <tr>
                <td><%=user.getUser_id()%></td>
                <td><%= user.getName()%></td>
                <td><%= user.getEmail()%></td>

            </tr>
            <% }}
                else
{

            %>
            <tr>
                <td colspan="3" class="no-records">No Records Found</td>
            </tr>
            <%

            }%>
        </table>
                <a href="./AdminFooter.jsp"></a>

    </body>
</html>
