/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.model;

import adminPanel.controller.EditProjectDetails;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Projects;

/**
 *
 * @author HP
 */
public class GetProjectforEdit {

    public Projects getProjectById(int projectId) {
        Projects project = null;
        try {

            String query = "SELECT * FROM flipr.projects WHERE projectId = ?";

            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, projectId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String name = rs.getString("projectName");
                String desc = rs.getString("projectDesc");
                String imagePath = rs.getString("projectImg");
                String status = rs.getString("projectStatus");
                String broker = rs.getString("brokerId");
                String buyer = rs.getString("buyerId");
                String seller = rs.getString("sellerId");

                project = new Projects(projectId, name, desc, imagePath, status, broker, buyer, seller);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return project;
    }

}
