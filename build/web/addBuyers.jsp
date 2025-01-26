<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add New Buyer</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
    </head>
    <body>
        <jsp:include page="./AdminNavbar.jsp" />

        <!-- Page Title -->
        <h1 class="form-title">Add New Buyer</h1>

        <!-- Form Section -->
        <form class="form-container" id="addBuyerForm" action="AddBuyerServlet" method="post">
            <!-- Client ID Field -->
            <div class="form-group">
                <label for="clientIdInput">Client ID:</label>
                <textarea id="clientIdInput" class="form-control" name="clientId" required></textarea>
            </div>

            <!-- Requirement Field -->
            <div class="form-group">
                <label for="requirementInput">Requirement:</label>
                <textarea id="requirementInput" class="form-control" name="requirement" required></textarea>
            </div> 
            
            <!-- Budget Field -->
            <div class="form-group">
                <label for="budgetInput">Budget:</label>
                <input type="text" id="budgetInput" class="form-control" name="budget" >
            </div>
            
            <!-- Project ID Field -->
            <div class="form-group">
                <label for="projectIdInput">Project ID:</label>
                <input type="text" id="projectIdInput" class="form-control" name="projectId" >
            </div>
            
            <!-- Broker ID Field -->
            <div class="form-group">
                <label for="brokerIdInput">Broker ID:</label>
                <input type="text" id="brokerIdInput" class="form-control" name="brokerId" required>
            </div>
            
            <!-- Submit Button -->
            <div class="form-group">
                <button class="btn-submit" type="submit">Add Buyer</button>
            </div>
        </form>
        <%
            System.out.println("inside jsp page");
            System.out.println("Client ID: " + request.getParameter("clientId"));
        System.out.println("Requirement: " + request.getParameter("requirement"));
        System.out.println("Budget: " + request.getParameter("budget"));
        System.out.println("Project ID: " + request.getParameter("projectId"));
        System.out.println("Broker ID: " + request.getParameter("brokerId"));
        %>
        <!-- Back to Buyer List Link -->
        <a href="FetchBuyers" class="btn-back" id="backToBuyersList">Back</a>

        <jsp:include page="./AdminFooter.jsp" />
    </body>
</html>
