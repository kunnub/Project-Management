<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add New Project</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
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
                    <option value="under-Negotiation">Under Negotiation</option>
                    <option value="Canceled">Canceled</option>
                </select>
            </div>
            
            <div class="form-group" id="projectNameGroup">
                <label for="projectBrokerInput">Broker Id:</label>
                <input type="text" id="projectNameInput" name="brokerId" required>
            </div>
            
            <div class="form-group" id="projectNameGroup">
                <label for="projectBuyerInput">Buyer:</label>
                <input type="text" id="projectNameInput" name="buyerId" required>
            </div>
            
            <div class="form-group" id="projectNameGroup">
                <label for="projectSellerInput">Seller:</label>
                <input type="text" id="projectNameInput" name="sellerId" required>
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

    </body>
</html>
