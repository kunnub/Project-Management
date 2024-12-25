
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DeleteProjects;
import model.GetProjectforEdit;
import model.Projects;

/**
 *
 * @author HP
 */
@WebServlet("/deleteProject")
public class DeleteProjectsServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String imageFolder = "C:/Users/HP/Documents/NetBeansProjects/projectMangment/web/ImgDirectory/";

            // Get project ID from request parameter
            int projectId = Integer.parseInt(request.getParameter("id"));

            // Fetch project details from the database using the project ID
            GetProjectforEdit projectFetcher = new GetProjectforEdit();
            Projects project = projectFetcher.getProjectById(projectId);

            // Delete the project from the database
            DeleteProjects deleteProject = new DeleteProjects();
            boolean flag = deleteProject.deleteProjects(projectId);
            if (flag) {
                System.out.println("Project deleted successfully!");

                // Get the image name associated with the project
                String imageName = project.getImage();  // Assuming `getProjectImage()` is a method in `Projects` model that returns the image name
                System.out.println("Image name: " + imageName);

                // If the project has an associated image, delete it from the local directory
                if (imageName != null && !imageName.isEmpty()) {
                    File imageFile = new File(imageFolder + imageName);
                    System.out.println("Path of the image: " + imageFile.getAbsolutePath());

                    if (imageFile.exists()) {
                        boolean deleted = imageFile.delete();
                        if (deleted) {
                            System.out.println("Image deleted successfully.");
                        } else {
                            System.out.println("Failed to delete image.");
                        }
                    }
                }

                // Redirect to the page that fetches project details
                response.sendRedirect("FetchProjectDetails");
            } else {
                response.getWriter().println("Failed to delete the project.");
            }

        } catch (SQLException ex) {
            System.out.println(ex);;
            response.getWriter().println("Error occurred while deleting the project.");
        }

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            DeleteProjects deleteProject = new DeleteProjects();
            if (deleteProject.deleteProjects(id)) {
                response.sendRedirect("FetchProjectDetails");
            } else {
                response.getWriter().println("failed to delete Project");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
