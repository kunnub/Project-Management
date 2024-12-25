/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginAuthenticator;

/**
 *
 * @author HP
 */
public class LoginController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("Clientlogin.html");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

//        System.out.println("Email: " + email);
//        System.out.println("Password: " + password);
        LoginAuthenticator l1 = new LoginAuthenticator();
        boolean login = false;
//System.out.println("Request URL: " + request.getRequestURL());

        try {
            login = l1.isLogin(email, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        if (login) {
            HttpSession session = request.getSession(true);
            session.setAttribute("email", email);
            response.sendRedirect("displayProjectsHome");

        } else {
            response.sendRedirect("Clientlogin.html?error=invalid_credentials");
        }

    }

}
