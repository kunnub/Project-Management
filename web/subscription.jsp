<%@page import="model.Subscriber"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Subscription Management</title>
        <link rel="stylesheet" href="styles/subscription.css">
    </head>
    <body>
        <div class="container">
            <h1>Subscription Management</h1>
            <table>
                <thead>
                    <tr>
                        <th>Subscriber ID</th>
                        <th>Email</th>
                        <th>Subscription Date</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        System.out.println("program starteed....");
                        List<model.Subscriber> jspsubscribers = (List<model.Subscriber>) request.getAttribute("subscribers");
                        System.out.println("hellooooo");
//                        if (subscribers == null) {
//                            out.println("Subscriber list is null.");
//                        } else {
//                            out.println("Subscriber list size: " + subscribers.size());
//                        }
//                        for (Subscriber subscriber:subscribers) {
////                            System.out.println(subscribers.get(i));
//                            System.out.println("hello .......");
//                        }
                        if (jspsubscribers != null && !jspsubscribers.isEmpty()) {
                            System.out.println("if statement called");
                            for (model.Subscriber subscriber : jspsubscribers) {
                    %>
                    <tr>
                        <td><%= subscriber.getId()%></td>
                        <td><%= subscriber.getEmail()%></td>
                        <td><%= subscriber.getSubscriptiondate()%></td>
                        <td>
                            <form action="DeleteSubscriptions" method="post">
                                <input type="hidden" name="id" value="<%= subscriber.getId()%>">
                                <input type="submit" class="delete-btn" value="Delete">
                            </form>
                        </td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="4" class="no-records">No records found</td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
