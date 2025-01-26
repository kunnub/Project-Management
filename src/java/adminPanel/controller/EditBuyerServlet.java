/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.controller;

import adminPanel.model.EditBuyer;
import adminPanel.model.GetBuyerForEdit;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Buyers;

/**
 *
 * @author HP
 */
public class EditBuyerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("buyerId");

        if (idParam == null || idParam.isEmpty()) {
            System.out.println("hello kunal failure");
            response.sendRedirect("errorPage.jsp"); // Handle missing ID
            return;
        }

        int buyerId;
        try {
            buyerId = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            System.out.println("hello kun number format expreseion");
            response.sendRedirect("errorPage.jsp"); // Handle invalid ID format
            return;
        }

        // Fetch project details from the database
        GetBuyerForEdit getBuyers = new GetBuyerForEdit();
        Buyers buyer = getBuyers.getBuyerById(buyerId);

        if (buyer == null) {
            response.sendRedirect("errorPage.jsp"); // Handle project not found
            return;
        }

        // Set project details as request attributes and forward to JSP
        request.setAttribute("buyer", buyer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editBuyers.jsp");
        dispatcher.forward(request, response);
    }

    // Handle POST request to update project details
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idParam = request.getParameter("buyerId");

        if (idParam == null || idParam.isEmpty()) {
            System.out.println("id param null in post ");
            response.sendRedirect("errorPage.jsp"); // Handle missing ID
            return;
        }

        int buyerId;
        try {
            buyerId = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid project ID.");
            request.getRequestDispatcher("/errorPage.jsp").forward(request, response);
            return;
        }

        // Retrieve form data
//        String buyerId = request.getParameter("BuyerId");
        String clientIdStr = request.getParameter("clientId");
        String requirement = request.getParameter("requirement");
        String budget = request.getParameter("budget");
        String projectIdStr = request.getParameter("projectId");
        String brokerIdStr = request.getParameter("brokerId");

// Parse integer values, ensuring null safety
        Integer clientId = (clientIdStr == null || clientIdStr.trim().isEmpty()) ? null : Integer.parseInt(clientIdStr);
        Integer projectId = (projectIdStr == null || projectIdStr.trim().isEmpty()) ? null : Integer.parseInt(projectIdStr);
        Integer brokerId = (brokerIdStr == null || brokerIdStr.trim().isEmpty()) ? null : Integer.parseInt(brokerIdStr);

        // Fetch the existing project details
        GetBuyerForEdit buyerFetcher = new GetBuyerForEdit();
        Buyers buyer = buyerFetcher.getBuyerById(buyerId);

        if (buyer == null) {
            response.sendRedirect("errorPage.jsp"); // Handle project not found
            return;
        }

        // Update project details in the database
        EditBuyer buyerModel = new EditBuyer();
        boolean isUpdated = buyerModel.updateBuyer(buyerId, clientId, requirement, budget, projectId, brokerId);

        if (isUpdated) {
            // Successfully updated, redirect to project list
            response.sendRedirect("FetchBuyers");
        } else {
            // Update failed, redirect to error page
            request.setAttribute("error", "Project update failed.");
            request.getRequestDispatcher("/errorPage.jsp").forward(request, response);
        }
    }
}
