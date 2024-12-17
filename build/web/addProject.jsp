<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Project</title>
</head>
<body>
    <h1>Add New Project</h1>
    <form action="AddProjectsServlet" method="post" >
        <label for="name">Project Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="description">Description:</label>
        <textarea id="description" name="description" required></textarea><br><br>

        <label for="status">Status:</label>
        <select id="status" name="status">
            <option value="Active">Active</option>
            <option value="Inactive">Inactive</option>
        </select><br><br>

        <button type="submit">Add Project</button>
    </form>
    <br>
    <a href="projects.jsp">Back to Project List</a>
</body>
</html>
