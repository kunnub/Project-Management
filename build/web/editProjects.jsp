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
            String idParam = request.getParameter("id");
            System.out.println(idParam + " it is the id param");
            if (idParam == null || idParam.isEmpty()) {
                out.println("Error: Project ID is missing.");
                return;
            }
            int projectId = Integer.parseInt(idParam);
            // Now, use the projectId to fetch project details from the database
        %>


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

            <div class="form-group" id="projectStatusGroup">
                <label for="projectStatusSelect">Status:</label>
                <select id="projectStatusSelect" name="status">
                    <%System.out.println("project status is  " + project.getStatus());%>
                    <option value="Active" <%= project.getStatus().equals("Active") ? "selected" : ""%>>For-Sale</option>
                    <option value="Inactive" <%= project.getStatus().equals("Inactive") ? "selected" : ""%>>Sold</option>
                    <option value="processing" <%= project.getStatus().equals("processing") ? "selected" : ""%>>under-negotiation</option>
                    <option value="canceled" <%= project.getStatus().equals("canceled") ? "selected" : ""%>>canceled</option>

                </select>
            </div>

            <div class="form-group" id="projectNameGroup">
                <label for="brokerInput">Broker Details:</label>
                <input type="text" id="projectNameInput" name="brokerId" value="<%= project.getBroker()%>" required>
            </div>

            <div class="form-group" id="projectNameGroup">
                <label for="buyerInput">Buyer:</label>
                <input type="text" id="projectNameInput" name="buyerId" value="<%= project.getBuyer()%>" required>
            </div>

            <div class="form-group" id="projectNameGroup">
                <label for="sellerInput">Seller:</label>
                <input type="text" id="projectNameInput" name="sellerId" value="<%= project.getSeller()%>" required>
            </div>

            <div class="form-group" id="projectImageGroup">
                <label for="projectImageInput">Image</label>
                <%System.out.println("project image is  " + project.getImage());%>

                <input type="file" name="image" id="image" accept="image/*" ><%= project.getImage()%><br>
                <!--<file id="projectDescriptionInput" name="image" required></textarea>-->
            </div>



            <div class="form-group" id="submitButtonGroup">
                <button id="updateProjectButton" type="submit">Update</button>
            </div>
        </form>
        <a href="FetchProjectDetails" id="backToProjectList">Back</a>


        <jsp:include page="./AdminFooter.jsp" />

    </body>
</html>
