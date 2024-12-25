/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class AdminLogger extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        HttpSession session = request.getSession(false);

//        if (session == null || session.getAttribute("role") == null || !session.getAttribute("role").equals("admin")) {
//            // Redirect to login page if not authenticated or not an admin
//            response.sendRedirect("registration.html");
//        } else {
//            // Forward to the admin page if authenticated
//            request.getRequestDispatcher("/admin.jsp").forward(request, response);
//        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username != null && password != null && username.equalsIgnoreCase("Admin") && password.equals("@dmin123")) {
            HttpSession session = request.getSession();
            session.setAttribute("isAdminLoggedIn", true);
            session.setAttribute("role", "admin");  // Set the role attribute

            response.sendRedirect("admin.jsp");
        } else {
            response.sendRedirect("AdminLogin.html");
        }
    }
}
