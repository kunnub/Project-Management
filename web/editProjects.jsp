<%@page import="model.Projects"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit Project</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>

    </head>
<<<<<<< HEAD
    <body>       
        <jsp:include page="./AdminNavbar.jsp" />

        <%System.out.println("inside edit projects.jsp ");%>
        <h1>Edit Project</h1>
        <%
            Projects project = (Projects) request.getAttribute("project");
            if (project == null) {
                out.println("Error: Project details not found.");
                return;
            }
        %>
        <%
=======
    <body>        <a href="./AdminNavbar.jsp"></a>

        <h1>Edit Project</h1>
        <%
>>>>>>> 259ff45806a07ac69aaebc4fbf7bb0dc1ff7a989
            String idParam = request.getParameter("id");
            System.out.println(idParam + " it is the id param");
            if (idParam == null || idParam.isEmpty()) {
                out.println("Error: Project ID is missing.");
                return;
            }
            int projectId = Integer.parseInt(idParam);
            // Now, use the projectId to fetch project details from the database
        %>
<<<<<<< HEAD


        <form id="editProjectForm" action="EditProjectDetails" method="post" enctype="multipart/form-data">
            <input type="hidden" name="id" value="<%= project.getId()%>">
            <%--<%= "Debug ID: " + project.getId()%>--%>

            <div class="form-group" id="projectNameGroup">
                <label for="projectNameInput">Project Name:</label>
                <input type="text" id="projectNameInput" name="name" value="<%= project.getName()%>" required>
            </div>

            <div class="form-group" id="projectDescriptionGroup">
                <label for="projectDescriptionInput">Description:</label>
                <textarea id="projectDescriptionInput" name="description" required><%= project.getDesc()%></textarea>
            </div>

            <div class="form-group" id="projectImageGroup">
                <label for="projectImageInput">Image</label>
                <%System.out.println("project image is  " + project.getImage());%>

                <input type="file" name="image" id="image" accept="image/*" required><%= project.getImage()%><br>
                <!--<file id="projectDescriptionInput" name="image" required></textarea>-->
            </div>

            <div class="form-group" id="projectStatusGroup">
                <label for="projectStatusSelect">Status:</label>
                <select id="projectStatusSelect" name="status">
                    <%System.out.println("project status is  " + project.getStatus());%>
                    <option value="Active" <%= project.getStatus().equals("Active") ? "selected" : ""%>>For-Sale</option>
                    <option value="Inactive" <%= project.getStatus().equals("Inactive") ? "selected" : ""%>>Sold</option>
                </select>
            </div>

            <div class="form-group" id="submitButtonGroup">
                <button id="updateProjectButton" type="submit">Update</button>
            </div>
        </form>
        <a href="FetchProjectDetails" id="backToProjectList">Back</a>


        <jsp:include page="./AdminFooter.jsp" />
=======
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
>>>>>>> 259ff45806a07ac69aaebc4fbf7bb0dc1ff7a989

    </body>
</html>
