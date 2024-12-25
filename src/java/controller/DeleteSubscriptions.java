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
import model.DeleteSubscribers;

/**
 *
 * @author HP
 */
@WebServlet("/deletesubscriptions")

public class DeleteSubscriptions extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            DeleteSubscribers deleteSubscriber = new DeleteSubscribers();
            if (deleteSubscriber.deleteSubscribers(id)) {
                response.sendRedirect("FetchSubscriptions");
            } else {
                response.getWriter().println("failed to delete value");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
