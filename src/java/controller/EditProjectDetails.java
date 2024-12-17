/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.UpdateProjectDetail;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GetProjectforEdit;
import model.Projects;

/**
 *
 * @author HP
 */
public class EditProjectDetails extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("id");
        System.out.println("id param is  " + idParam);
        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("errorPage.jsp");  // Handle missing ID
            return;
        }

        int projectId = Integer.parseInt(idParam);

        // Fetch project details from the database using projectId
        GetProjectforEdit getProject = new GetProjectforEdit();
        Projects project = getProject.getProjectById(projectId); // Corrected method call
        if (project == null) {
            response.sendRedirect("errorPage.jsp");  // Handle project not found
            return;
        }

        // Set the project details as request attributes
        request.setAttribute("project", project);

        // Forward to editProjects.jsp to display the project details
        RequestDispatcher dispatcher = request.getRequestDispatcher("editProjects.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("id");
        System.out.println("Received id: " + idParam);
        int projectId = Integer.parseInt(idParam);
        System.out.println(projectId);

        try {
            // Retrieve form data

            if (idParam == null || idParam.isEmpty()) {
                out.println("Id fetched is null"); // Handle missing ID
                return;
            }
            String name = request.getParameter("name");
            String desc = request.getParameter("description");
            String status = request.getParameter("status");

            // Create an instance of ProjectModel
            UpdateProjectDetail projectModel = new UpdateProjectDetail();

            // Call the update method to update the project in the database
            boolean isUpdated = projectModel.updateProject(projectId, name, desc, status);

            if (isUpdated) {
                // Successfully updated the project details
                response.sendRedirect("FetchProjectDetails"); // Redirect to the project list page after updating
            } else {
                // If update failed, redirect to an error page
                System.out.println("isupdate is " + isUpdated);
                request.setAttribute("error", "Project update failed.");
                request.getRequestDispatcher("/errorPage.jsp").forward(request, response);
            }
        } catch (NumberFormatException e) {
            System.out.println("number format exceptions");
            // Handle case where projectId is not a valid integer
            request.setAttribute("error", "Invalid project ID.");
            request.getRequestDispatcher("/errorPage.jsp").forward(request, response);
        }
        // Optionally, set an error attribute and forward to an error page

    }
}
