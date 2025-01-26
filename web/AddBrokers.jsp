<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add New Broker</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
    </head>
    <body>
        <jsp:include page="./AdminNavbar.jsp" />

        <!-- Page Title -->
        <h1 id="addBrokerTitle">Add New Broker</h1>

        <!-- Form Section -->
        <form id="addBrokers" action="AddProjectsBroker" method="post" enctype="multipart/form-data">
            <!-- Project Name Field -->
            <div class="form-group" id="projectNameGroup">
                <label for="projectNameInput">Broker Name:</label>
                <input type="text" id="projectNameInput" name="name" required>
            </div>
            
             <div class="form-group" id="projectNameGroup">
                <label for="projectNameInput">Broker Ph-No</label>
                <input type="text" id="projectNameInput" name="phNo" required>
            </div>
            
             <div class="form-group" id="projectNameGroup">
                <label for="projectNameInput">Broker E-mail:</label>
                <input type="mail" id="projectNameInput" name="Mail" required>
            </div>
            
             <div class="form-group" id="projectNameGroup">
                <label for="projectNameInput">Joining Date:</label>
                <input type="date" id="projectNameInput" name="date" required>
            </div>

            
<!--            Image field
            <div class="form-group" id="projectStatusGroup">
                <label for="projectImageInput">Upload Image:</label>
                <input type="file" name="image" id="image" accept="image/*" required><br>
            </div>-->

            <!-- Submit Button -->
            <div class="form-group" id="submitButtonGroup">
                <button id="submitProjectButton" type="submit">Add Broker</button>
            </div>
        </form>

        <!-- Back to Project List Link -->
        <!--        <div id="backToProjectLinkContainer">-->
        <a href="FetchProjectDetails" id="backToBrokerDisplay">Back</a>
        <!--</div>-->

        <jsp:include page="./AdminFooter.jsp" />

    </body>
</html>
