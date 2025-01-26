package adminPanel.controller;

import java.io.File;
import java.io.FileOutputStream;
import adminPanel.model.UpdateProjectDetail;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import adminPanel.model.GetProjectforEdit;
import model.Projects;

@WebServlet("/editProject")
@MultipartConfig
public class EditProjectDetails extends HttpServlet {

    // Handle GET request to fetch project details for editing
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("id");

        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("errorPage.jsp"); // Handle missing ID
            return;
        }

        int projectId;
        try {
            projectId = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.sendRedirect("errorPage.jsp"); // Handle invalid ID format
            return;
        }

        // Fetch project details from the database
        GetProjectforEdit getProject = new GetProjectforEdit();
        Projects project = getProject.getProjectById(projectId);

        if (project == null) {
            response.sendRedirect("errorPage.jsp"); // Handle project not found
            return;
        }

        // Set project details as request attributes and forward to JSP
        request.setAttribute("project", project);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editProjects.jsp");
        dispatcher.forward(request, response);
    }

    // Handle POST request to update project details
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("id");

        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("errorPage.jsp"); // Handle missing ID
            return;
        }

        int projectId;
        try {
            projectId = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid project ID.");
            request.getRequestDispatcher("/errorPage.jsp").forward(request, response);
            return;
        }

        // Retrieve form data
        String name = request.getParameter("name");
        String desc = request.getParameter("description");
        String status = request.getParameter("status");
        String brokerId = request.getParameter("brokerId");
        String buyerId = request.getParameter("buyerId");
        String sellerId = request.getParameter("sellerId");

        Part imageFile = request.getPart("image");
        String imageName = imageFile.getSubmittedFileName();
        String imgFolder = "C:/Users/HP/Documents/NetBeansProjects/projectMangment/web/ImgDirectory/";
        String imagePath;

        // Fetch the existing project details
        GetProjectforEdit projectFetcher = new GetProjectforEdit();
        Projects project = projectFetcher.getProjectById(projectId);

        if (project == null) {
            response.sendRedirect("errorPage.jsp"); // Handle project not found
            return;
        }

        // Determine whether to keep the existing image or use the new one
        if (imageName != null && !imageName.isEmpty()) {
            imagePath = imgFolder + imageName;
            System.out.println("New image name is: " + imageName);

            // Save the new image
            try (FileOutputStream fos = new FileOutputStream(imagePath);
                 InputStream ist = imageFile.getInputStream()) {
                byte[] data = new byte[ist.available()];
                ist.read(data);
                fos.write(data);
            } catch (Exception e) {
                System.out.println("Error saving image: " + e);
            }

            // Delete the old image if it exists
            String oldImageName = project.getImage();
            File oldImageFile = new File(imgFolder + oldImageName);
            if (oldImageFile.exists()) {
                oldImageFile.delete();
            }
        } else {
            // Keep the existing image
            imageName = project.getImage();
            imagePath = imgFolder + imageName;
            System.out.println("No new image uploaded. Keeping the existing image: " + imagePath);
        }

        // Update project details in the database
        UpdateProjectDetail projectModel = new UpdateProjectDetail();
        boolean isUpdated = projectModel.updateProject(projectId, name, desc, status, imageName,brokerId,buyerId,sellerId);

        if (isUpdated) {
            // Successfully updated, redirect to project list
            response.sendRedirect("FetchProjectDetails");
        } else {
            // Update failed, redirect to error page
            request.setAttribute("error", "Project update failed.");
            request.getRequestDispatcher("/errorPage.jsp").forward(request, response);
        }
    }
}
