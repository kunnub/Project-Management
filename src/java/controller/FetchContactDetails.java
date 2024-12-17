/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ContactDetails;
import model.GetContactDetails;

/**
 *
 * @author HP
 */
public class FetchContactDetails extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

//            System.out.println("get method called");
            GetContactDetails contactDetail = new GetContactDetails();
            List<ContactDetails> listOfcontacts = contactDetail.FetchContacts();
            
//            
//            if (listOfcontacts == null) {
//                listOfcontacts = new ArrayList<>(); // Initialize empty list to avoid null pointer
//                System.out.println("the list is empty...");
//            }
//            else{
//                System.out.println("subscribers size= "+listOfcontacts.size());
//            }
            
            request.setAttribute("contacts", listOfcontacts);
//            request.getRequestDispatcher("contactForm.jsp").forward(request, response);

            RequestDispatcher dispatcher = request.getRequestDispatcher("contactForm.jsp");
            dispatcher.forward(request, response);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}


