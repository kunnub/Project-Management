<%-- 
    Document   : contactForm
    Created on : Nov 9, 2024, 10:29:12 PM
    Author     : HP
--%>

<%@page import="model.ContactDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact Form Submissions</title>
        <link rel="stylesheet" href="./AdminFormsCSS.css"/>
    </head>
    <body>       
        <jsp:include page="./AdminNavbar.jsp" />

        <h1>Contact Form Submissions</h1>
        <table style="height: 100%;">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone_no</th>
                    <th>Query</th>
                    <th>Address</th>
                    <th>Is Consulted ?</th>
                    <th>Result/Outcome</th>
                    <th>Assigned Broker</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>

                <%
                    List<model.ContactDetails> jspcontactList = (List<model.ContactDetails>) request.getAttribute("contacts");
                    System.out.println("contact list created");

                    if (jspcontactList != null) {
                        System.out.println("Contacts list size: " + jspcontactList.size());
                    } else {
                        System.out.println("Contacts attribute is null.");
                    }

                    if (jspcontactList != null && !jspcontactList.isEmpty()) {
                        System.out.println(jspcontactList.size());
                        for (ContactDetails contact : jspcontactList) {

                %>

                <tr>
                    <td><%=contact.getId()%></td>
                    <td><%= contact.getName()%></td>
                    <td><%= contact.getEmail()%></td>
                    <td><%= contact.getPhone_no()%></td>
                    <td><%=contact.getQuery()%></td>
                    <td><%= contact.getAddress()%></td>
                    <td><%=contact.getIsConsulted()%></td>
                    <td><%=contact.getResult()%></td>
                    <td><%=contact.getBroker()%></td>
                     
                    <td>
                    <!-- Edit Button -->
                    <form action="EditProjectDetails" method="get" style="display:inline;">
                        <input type="hidden" name="id" value="<%= contact.getId()%>">
                        <button type="submit">Edit</button>
                    </form>

                    <!-- Delete Button -->
                    <form action="DeleteProjectsServlet" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="<%= contact.getId()%>">
                        <button type="submit" class="delete-btn" onclick="return confirm('Are you sure you want to delete this project?')">Delete</button>
                    </form>
                </td>
                </tr>
                <%

                    }
                } else {
                %>
                <tr>
                    <td colspan='4' class="no-records">No Records Found</td>
                </tr>
                <%}%>
            </tbody>


        </table>
        <jsp:include page="./AdminFooter.jsp" />


    </body>
</html>

