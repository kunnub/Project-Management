<%-- 
    Document   : projects
    Created on : Nov 9, 2024, 10:28:03 PM
    Author     : HP
--%>
<%@page import="model.Buyers"%>
<%@page import="java.util.List"%>
<%@page import="model.Projects"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Buyers Details</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
    </head>
    <body>       

        <jsp:include page="./AdminNavbar.jsp" />


        <h1>Buyers Details</h1>
        <table>
            <tr>          
                <th>Client Id</th>
                <th>Buyer Id</th>
                <th>requirements</th>
                <th>budget</th>
                <th>Project Id</th>
                <th>Broker Id</th>
                <th>Action</th>

            </tr>

            <%
                List<Buyers> buyerList = (List<model.Buyers>) request.getAttribute("buyerList");

                if (buyerList != null && !buyerList.isEmpty()) {
                    for (Buyers buyer : buyerList) {

//                        System.out.println(buyer.getRequirement() + "jsp page :");
%>


            <tr>             

                <td><%= buyer.getB_clientId()%></td>
                <td><%= buyer.getBuyerId()%></td>
                <td><%=buyer.getRequirement()%></td>
                <td><%= buyer.getBudget()%></td>
                <% String projectId = "null";
                    if (buyer.getB_projectId() == 0) {
                %><td><%=projectId%></td>
                <%}else{%><td><%=buyer.getB_projectId()%></td>
                <%}%>
                <td><%=buyer.getB_brokerId()%></td>


                <td>
                    <!--  Edit Button -->

                    <form action="EditBuyerServlet" method="get" style="display:inline;">
                        <input type="hidden" name="buyerId" value="<%= buyer.getBuyerId()%>">

                        <button type="submit">Edit</button>
                    </form>

                    <!--Delete Button--> 
                    <form action="DeleteBuyerServlet" method="post" style="display:inline;">
                        <input type="hidden" name="buyerId" value="<%= buyer.getBuyerId()%>">
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
        <a href="addBuyers.jsp" id="addNewBuyer">Add New Buyer</a>
        <jsp:include page="./AdminFooter.jsp" />


    </body>
</html>

