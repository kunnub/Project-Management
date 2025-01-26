<%@page import="model.Buyers"%>
<%@page import="model.Projects"%>
<%@page import="java.util.*"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Edit Project</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>

    </head>
    <body>       
        <jsp:include page="./AdminNavbar.jsp" />

        <%System.out.println("inside edit buyer.jsp ");%>
        <h1>Edit Buyer</h1>
        <%
            Buyers buyer = (Buyers) request.getAttribute("buyer");
            if (buyer == null) {
                out.println("Error: Buyer's detail not found.");
                return;
            }
        %>
        <%
            String idParam = request.getParameter("buyerId");
            System.out.println(idParam + " it is the id param");
            if (idParam == null || idParam.isEmpty()) {
                out.println("Error: buyer ID is missing.");
                return;
            }
            int buyerId = Integer.parseInt(idParam);
            // Now, use the projectId to fetch project details from the database
%>


        <form id="editProjectForm" action="EditBuyerServlet" method="post">
            <input type="hidden" name="buyerId" value="<%= buyer.getBuyerId()%>">
            <%--<%= "Debug ID: " + project.getId()%>--%>

            <div class="form-group" id="projectNameGroup">
                
                <label for="BuyerClientId"><span style="margin: 1px 3px; display: inline; color: gray;">🔒</span> Client Id:</label>
                
                       <input type="text" id="clientIdInput" name="clientId" value="<%= buyer.getB_clientId()%>" readonly >
                    
                </div>
             
            <!--</div>-->

            <div class="form-group" id="projectDescriptionGroup">
                <label for="projectRequirementInput">Requirement</label>
                <textarea id="projectrequirementInput" name="requirement" required><%= buyer.getRequirement()%></textarea>
            </div>


            <div class="form-group" id="projectNameGroup">
                <label for="Budget">Budget</label>
                <input type="text" id="projectNameInput" name="budget" value="<%= buyer.getBudget()%>" >
            </div>

            <div class="form-group" id="projectNameGroup">
                <label for="buyerInput">Project Id:</label>
                <input type="text" id="projectIdInput" name="projectId" value="<%= buyer.getB_projectId()%>" >
            </div>

            <div class="form-group" id="projectNameGroup">
                <label for="sellerInput">Broker ID:</label>
                <input type="text" id="projectNameInput" name="brokerId" value="<%= buyer.getB_brokerId()%>" required>
            </div>


            <div class="form-group" id="submitButtonGroup">
                <button id="updateBuyerButton" type="submit">Update</button>
            </div>
        </form>
        <a href="FetchBuyers" id="backToBuyersList">Back</a>


        <jsp:include page="./AdminFooter.jsp" />

    </body>
</html>
