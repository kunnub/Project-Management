/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileOutputStream;
import model.UpdateProjectDetail;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.GetProjectforEdit;
import model.Projects;

/**
 *
 * @author HP
 */
@WebServlet("/editProject")

@MultipartConfig
public class EditProjectDetails extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("id");
        System.out.println("Received ID in doGet: " + idParam);  // Add this line to check the ID value

//        String idParam = request.getParameter("id");
        System.out.println("id param is  " + idParam);
        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("error.jsp");  // Handle missing ID
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

            Part imageFile = request.getPart("image");

            String imageName = imageFile.getSubmittedFileName();

            String imgFolder = "C:/Users/HP/Documents/NetBeansProjects/projectMangment/web/ImgDirectory/";
            String imagePath = imgFolder + imageName;

            if (imageName != null && !imageName.isEmpty()) {

                System.out.println("image name is : " + imageName);

                try {
                    FileOutputStream fos = new FileOutputStream(imagePath);
                    InputStream ist = imageFile.getInputStream();
                    byte data[] = new byte[ist.available()];
                    ist.read(data);
                    fos.write(data);
                    fos.close();
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

            // Create an instance of GetProjectforEdit
            GetProjectforEdit projectFetcher = new GetProjectforEdit();

// Fetch the project details using the ID
            Projects project = projectFetcher.getProjectById(projectId);

            if (project != null) {
                String oldImageName = project.getImage(); // Get the old image name from the project object
                File oldImageFile = new File(imgFolder + oldImageName);

                if (oldImageFile.exists()) {
                    oldImageFile.delete(); // Delete the old image file
                }
            } else {
                // Handle the case where the project is not found
                System.out.println("Project not found with ID: " + projectId);
            }

            // Create an instance of ProjectModel
            UpdateProjectDetail projectModel = new UpdateProjectDetail();

            // Call the update method to update the project in the database
            boolean isUpdated = projectModel.updateProject(projectId, name, desc, status, imageName);

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
