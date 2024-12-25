/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class UpdateProjectDetail {

    public boolean updateProject(int projectId, String name, String desc, String status, String image) {

        System.out.println("UpdateProjectDetail class called");
        boolean isUpdated = false;
        String sql = "UPDATE flipr.projects SET projectName = ?, projectDesc = ?,projectImg=?, projectStatus = ? WHERE projectId = ?";

        // Update the project details in the database
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, desc);
            pst.setString(3, image);
            pst.setString(4, status);
            pst.setInt(5, projectId);

            System.out.println("Executing query: " + sql); // Debugging: print SQL query
            System.out.println("Values: " + name + ", " + desc + ", " + status + ", " + projectId); // Debugging: print parameter values

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                isUpdated = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

}
