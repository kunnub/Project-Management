/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AddSubscribers;

/**
 *
// * @author HP
* */
 @WebServlet("/addSubscription")

public class AddSubscription extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("admin.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String email = request.getParameter("email");

            AddSubscribers sub = new AddSubscribers();
            boolean subscribed = false;

            subscribed = sub.isSubscribed(email);

            if (subscribed) {
//            request.setAttribute("message", "action performed succesfully");
                response.getWriter().println("<script>alert('Subscribed successfully!'); window.location.href = 'displayProjectsHome';</script>");

            } else {
//            request.setAttribute("message", "Action failed. Please try again.");
                response.getWriter().println("<script>alert('Subscription failed. Please try again!'); window.location.href = 'displayProjectsHome';</script>");


            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
