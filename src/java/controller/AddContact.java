/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AddContactForm;

/**
 *
 * @author HP
 */
@WebServlet("/addContact")
public class AddContact extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("displayProjectsHome");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phno = request.getParameter("mobile");
        String address = request.getParameter("address");

//        System.out.println("Name: " + name);
//        System.out.println("Email: " + email);
//        System.out.println("Mobile: " + phno);
//        System.out.println("Address: " + address);

        AddContactForm contact = new AddContactForm();
        boolean cont = false;

        cont = contact.isContacted(name, email, phno, address);
        System.out.println(cont);

        if (cont) {
            response.getWriter().println("<script>alert('request Sent'); window.location.href = 'displayProjectsHome';</script>");
        } else {
            response.getWriter().println("<script>alert('request not sent! try again later'); window.location.href = 'displayProjectsHome';</script>");


        }

    }
}
