/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.controller;

import adminPanel.model.DeleteBuyer;
import adminPanel.model.DeleteProjects;
import adminPanel.model.DeleteSubscribers;
import adminPanel.model.GetProjectforEdit;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Projects;

/**
 *
 * @author HP
 */
public class DeleteBuyerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int buyerId = Integer.parseInt(request.getParameter("buyerId"));
            DeleteBuyer deletebuyer = new DeleteBuyer();
            if (deletebuyer.deleteBuyer(buyerId)) {
                response.sendRedirect("FetchBuyers");
            } else {

                response.getWriter().println("failed to delete value");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
}
