/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.controller;

import adminPanel.model.AddBuyers;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author HP
 */
//@WebServlet("/AddBuyer")
public class AddBuyerServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("FetchBuyers");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("inside do post method part 2");

        String clientId = request.getParameter("clientId");
        String requirement = request.getParameter("requirement");
        String budget = request.getParameter("budget");
        String projectId = request.getParameter("projectId");
        String brokerId = request.getParameter("brokerId");

        System.out.println("Client ID: " + request.getParameter("clientId"));
        System.out.println("Requirement: " + request.getParameter("requirement"));
        System.out.println("Budget: " + request.getParameter("budget"));
        System.out.println("Project ID: " + request.getParameter("projectId"));
        System.out.println("Broker ID: " + request.getParameter("brokerId"));

        AddBuyers addBuyer = new AddBuyers();
        boolean isAdd = false;
        isAdd = addBuyer.isAdded(clientId, requirement, budget, projectId, brokerId);

        if (isAdd) {
            response.sendRedirect("FetchBuyers");
        } else {
            response.sendRedirect("buyers.jsp");
        }

    }

}
