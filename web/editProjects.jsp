<%@page import="model.Projects"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit Project</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>

    </head>
    <body>        <a href="./AdminNavbar.jsp"></a>

        <h1>Edit Project</h1>
        <%
            String idParam = request.getParameter("id");
            System.out.println(idParam + " it is the id param");
            if (idParam == null || idParam.isEmpty()) {
                out.println("Error: Project ID is missing.");
                return;
            }
            int projectId = Integer.parseInt(idParam);
            // Now, use the projectId to fetch project details from the database
        %>
        <%
            Projects project = (Projects) request.getAttribute("project");
            if (project == null) {
                out.println("Error: Project details not found.");
                return;
            }
        %>


        <form action="EditProjectDetails" method="post" >
            <input type="hidden" name="id" value="<%= project.getId()%>">
            <%= "Debug ID: " + project.getId()%>

            <label for="name">Project Name:</label>
            <input type="text" id="name" name="name" value="<%= project.getName()%>"><br><br>

            <label for="description">Description:</label>
            <textarea id="description" name="description"><%= project.getDesc()%></textarea><br><br>

            <label for="status">Status:</label>
            <select id="status" name="status">
                <option value="Active" <%= project.getStatus().equals("Active") ? "selected" : ""%>>Active</option>
                <option value="Inactive" <%= project.getStatus().equals("Inactive") ? "selected" : ""%>>Inactive</option>

            </select><br><br>

            <button type="submit">Update</button>
        </form>
        <a href="./AdminFooter.jsp"></a>

    </body>
</html>
