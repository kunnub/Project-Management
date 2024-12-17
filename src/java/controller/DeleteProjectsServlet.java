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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DeleteProjects;

/**
 *
 * @author HP
 */
public class DeleteProjectsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            int id= Integer.parseInt(request.getParameter("id"));
            DeleteProjects deleteProject=new DeleteProjects();
            if(deleteProject.deleteProjects(id)){
                response.sendRedirect("FetchProjectDetails");
            }
            else{
                response.getWriter().println("failed to delete Project");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }
}
