//package controller;
//
//import database.DBConnection;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/ImageServlet")
//public class ImageServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String projectId = request.getParameter("id");
//        Connection con = null;
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//
//        try {
//            // Establish database connection (update with your DB credentials)
//            String query = "SELECT image FROM projects WHERE id = ?";
//
//            // Query to fetch image based on project ID
//            con = DBConnection.getConnection();
//            pst = con.prepareStatement(query);
//            pst.setString(1, projectId);
//            rs = pst.executeQuery();
//
//            if (rs.next()) {
//                // Get the image BLOB data
//                byte[] imgData = rs.getBytes("image");
//
//                // Set the response content type and write the image data
//                response.setContentType("image/jpeg");
//                OutputStream out = response.getOutputStream();
//                out.write(imgData);
//                out.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
