<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add New Project</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
<<<<<<< HEAD
    </head>
    <body>
        <jsp:include page="./AdminNavbar.jsp" />

        <!-- Page Title -->
        <h1 id="addProjectTitle">Add New Project</h1>

        <!-- Form Section -->
        <form id="addProjectForm" action="AddProjectsServlet" method="post" enctype="multipart/form-data">
            <!-- Project Name Field -->
            <div class="form-group" id="projectNameGroup">
                <label for="projectNameInput">Project Name:</label>
                <input type="text" id="projectNameInput" name="name" required>
            </div>

            <!-- Description Field -->
            <div class="form-group" id="projectDescriptionGroup">
                <label for="projectDescriptionInput">Description:</label>
                <textarea id="projectDescriptionInput" name="description" required></textarea>
            </div>

            <!-- Status Field -->
            <div class="form-group" id="projectStatusGroup">
                <label for="projectStatusSelect">Status:</label>
                <select id="projectStatusSelect" name="status">
                    <option value="Active">For-Sale</option>
                    <option value="Inactive">Sold</option>
                </select>
            </div>
            <!--Image field-->
            <div class="form-group" id="projectStatusGroup">
                <label for="projectImageInput">Upload Image:</label>
                <input type="file" name="image" id="image" accept="image/*" required><br>
            </div>

            <!-- Submit Button -->
            <div class="form-group" id="submitButtonGroup">
                <button id="submitProjectButton" type="submit">Add Project</button>
            </div>
        </form>

        <!-- Back to Project List Link -->
        <!--        <div id="backToProjectLinkContainer">-->
        <a href="FetchProjectDetails" id="backToProjectList">Back</a>
        <!--</div>-->

        <jsp:include page="./AdminFooter.jsp" />
=======


    </head>
    <body>
        <a href="./AdminNavbar.jsp"></a>
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
        <a href="./AdminFooter.jsp"></a>

>>>>>>> 259ff45806a07ac69aaebc4fbf7bb0dc1ff7a989
    </body>
</html>
