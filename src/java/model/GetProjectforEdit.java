/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.EditProjectDetails;
import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author HP
 */
public class GetProjectforEdit {

    public Projects getProjectById(int projectId) {
        Projects project = null;
        try {

            String query = "SELECT projectId, projectName, projectDesc, projectImg,projectStatus FROM flipr.projects WHERE projectId = ?";

            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, projectId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String name = rs.getString("projectName");
                String desc = rs.getString("projectDesc");
                String imagePath = rs.getString("projectImg");
                String status = rs.getString("projectStatus");
                project = new Projects(projectId, name, desc, imagePath, status);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return project;
    }

}
