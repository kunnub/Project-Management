<%-- 
    Document   : projects
    Created on : Nov 9, 2024, 10:28:03 PM
    Author     : HP
--%>
<%@page import="java.util.List"%>
<%@page import="model.Projects"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Project Management</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
    </head>
    <body>       

        <jsp:include page="./AdminNavbar.jsp" />


        <h1>Project Management</h1>
        <table>
            <tr>          
                <th>Project Id</th>
                <th>Project Name</th>
                <th>Description</th>
                <th>project Image</th>
                <th>Project Status</th>
                <th>Actions</th>
            </tr>

            <%
                List<Projects> projectList = (List<model.Projects>) request.getAttribute("projectList");

                if (projectList != null && !projectList.isEmpty()) {
                    for (Projects project : projectList) {


            %>

            <tr>             
                <td><%= project.getId()%></td>
                <td><%= project.getName()%></td>
                <td><%= project.getDesc()%></td>
                <td><%= project.getStatus()%></td>
                <td><%=project.getImage()%></td>
                <td>
                    <!-- Edit Button -->
                    <form action="EditProjectDetails" method="get" style="display:inline;">
                        <input type="hidden" name="id" value="<%= project.getId()%>">
                        <button type="submit">Edit</button>
                    </form>

                    <!-- Delete Button -->
                    <form action="DeleteProjectsServlet" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="<%= project.getId()%>">
                        <button type="submit" class="delete-btn" onclick="return confirm('Are you sure you want to delete this project?')">Delete</button>
                    </form>
                </td>
            </tr>
            <% }
            } else {

            %>
            <tr>
                <td colspan="4" class="no-records" > no records found</td>
            </tr>
            <%}%>
        </table>
        <a href="addProject.jsp" id="addNewProject">Add New Project</a>
        <jsp:include page="./AdminFooter.jsp" />


    </body>
</html>

