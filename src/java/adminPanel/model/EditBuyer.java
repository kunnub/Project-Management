/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class EditBuyer {

    public boolean updateBuyer(int buyerId, int clientId, String requirement, String budget, Integer projectId, int brokerId) {

        System.out.println("UpdateProjectDetail class called");
        boolean isUpdated = false;
        String sql = "UPDATE flipr.buyers SET buyer_clientId = ?, req_specifications = ?,budget=?, buyer_projectId = ?,buyer_brokerId=? WHERE buyerId = ?";

        // Update the project details in the database
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, clientId);
            pst.setString(2, requirement);
            pst.setString(3, budget);
            
            if (projectId == null) {
                pst.setNull(4, java.sql.Types.INTEGER);
            } else {
                pst.setInt(4, projectId);
            }

            pst.setInt(5, brokerId); // Required field, so no null handling needed
            pst.setInt(6, buyerId); // Required field, so no null handling needed
          

            System.out.println("Executing query: " + sql); // Debugging: print SQL query
            System.out.println("Values: " + clientId + ", " + requirement + ", " + budget + ", " + projectId + ", " + brokerId + " ," + buyerId); // Debugging: print parameter values

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
