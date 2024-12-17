/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GetProjects;
import model.Projects;

/**
 *
 * @author HP
 */
public class FetchProjectDetails extends HttpServlet {

       
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        GetProjects projectDetails=new GetProjects();
        List<Projects> projectList = projectDetails.getProjects();
        
        request.setAttribute("projectList",projectList);
        RequestDispatcher dispatcher=request.getRequestDispatcher("projects.jsp");
        dispatcher.forward(request,response);
       
        
    }

    
}
