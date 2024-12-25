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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetProjectsHome;
import model.Projects;

/**
 *
 * @author HP
 */
@WebServlet("/home")
public class displayProjectsHome extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        GetProjectsHome projectDetails = new GetProjectsHome();
        List<Projects> projectData = projectDetails.getProjects();

        System.out.println("Fetched project list size: " + (projectData != null ? projectData.size() : "null"));

        request.setAttribute("projectData", projectData);

        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request, response);
    }
}
