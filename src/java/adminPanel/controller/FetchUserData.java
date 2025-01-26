/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import adminPanel.model.GetUserDetails;
import model.Users;

/**
 *
 * @author HP
 */
@WebServlet("/fetchUser")
public class FetchUserData extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            GetUserDetails user = new GetUserDetails();
            List<Users> UserList = user.getUserDetails();
            System.out.println(UserList);
            request.setAttribute("userList", UserList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("clients.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
