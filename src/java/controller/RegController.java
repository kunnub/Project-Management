/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Registrator;

/**
 *
 * @author HP
 */
public class RegController extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.sendRedirect("registration.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        
        Registrator rg=new Registrator();
        boolean register=false;
        try{
            register = rg.isRegister(name,email,password);
        }
        catch(SQLException e) {
            System.out.println(e);
            
        }
        if(register){
            HttpSession session =request.getSession(true);
              session.setAttribute("email", email);
            response.sendRedirect("home.jsp");
        }
        else{
            response.sendRedirect("registration.html");
        }
       
    }

}
