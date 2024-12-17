/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AddProjects;

/**
 *
 * @author HP
 */
public class AddProjectsServlet extends HttpServlet {

    

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.sendRedirect("FetchProjectDetails")  ;
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name=request.getParameter("name");
        String desc=request.getParameter("description");
        String status=request.getParameter("status");
        
        System.out.println(name);
        System.out.println(desc);
        System.out.println(status);
        
        AddProjects addProj=new AddProjects();
        boolean isAdd=false;
        isAdd=addProj.isAdded(name,desc,status);
        
        if(isAdd){
            response.sendRedirect("FetchProjectDetails");
        }
        else{
            response.sendRedirect("FetchProjectDetails");
        }
        
        
    }

  
}
