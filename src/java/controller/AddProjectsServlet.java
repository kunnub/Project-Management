/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.AddProjects;

/**
 *
 * @author HP
 */
@MultipartConfig
@WebServlet("/AddProject")
public class AddProjectsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("FetchProjectDetails");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("inside do post method part 2");

        String name = request.getParameter("name");
        String desc = request.getParameter("description");
        String status = request.getParameter("status");

        Part imageFile = request.getPart("image");
        System.out.println(name);
        System.out.println(desc);
        System.out.println(status);

        String imageName = imageFile.getSubmittedFileName();
        System.out.println("file name is : " + imageName);

        String imageUploadPath = "C:/Users/HP/Documents/NetBeansProjects/projectMangment/web/ImgDirectory/" + imageName;

        FileOutputStream fos = new FileOutputStream(imageUploadPath);
        try (InputStream inputStr = imageFile.getInputStream()) {
            byte[] data = new byte[inputStr.available()];
            inputStr.read(data);
            fos.write(data);
            fos.close();
        }

        System.out.println(imageName);

        AddProjects addProj = new AddProjects();
        boolean isAdd = false;
        isAdd = addProj.isAdded(name, desc, imageName, status);

        if (isAdd) {
            response.sendRedirect("FetchProjectDetails");
        } else {
            response.sendRedirect("FetchProjectDetails");
        }

    }

}
