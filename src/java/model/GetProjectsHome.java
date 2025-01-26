/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class GetProjectsHome {

    public List<Projects> getProjects() {
        List<Projects> projectsList = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM flipr.projects;")) {

            while (rs.next()) {
                int id = rs.getInt("projectId");
                String name = rs.getString("projectName");
                String desc = rs.getString("projectDesc");
                String imagePath = rs.getString("projectImg");
                String status = rs.getString("projectStatus");
                String broker = rs.getString("brokerId");
                String buyer = rs.getString("buyerId");
                String seller = rs.getString("sellerId");

                Projects projectDetails = new Projects(id, name, desc, imagePath, status, broker, buyer, seller);
                projectsList.add(projectDetails);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return projectsList;
    }

}
