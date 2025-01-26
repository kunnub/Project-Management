/*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
 */
package adminPanel.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import adminPanel.model.GetSubscribers;
import model.Subscriber;

/**
 *
 * @author HP
 */
@WebServlet("/fetchSubscriptions")
public class FetchSubscriptions extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
//            System.out.println("Get method called...chk2");
            GetSubscribers getSubscribers = new GetSubscribers();
            List<Subscriber> subscribers = getSubscribers.fetchSubscribers();

//            if (subscribers == null) {
//                subscribers = new ArrayList<>(); // Initialize empty list to avoid null pointer
//                System.out.println("the list is empty...");
//            }
//            else{
//                System.out.println("subscribers size= "+subscribers.size());
//            }
            request.setAttribute("subscribers", subscribers);
//            System.out.println("chk3...");
            request.getRequestDispatcher("subscription.jsp").forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(FetchSubscriptions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
