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
public class GetProjects {

    public List<Projects> getProjects() {
        
        List<Projects> projectList = new ArrayList<>();

        String query = "SELECT projectId,projectName,projectDesc,projectStatus FROM flipr.projects;";
        try {

            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (!rs.isBeforeFirst()) {
                System.out.println("the table is empty");
            } else {
                while (rs.next()) {

                    int id = rs.getInt("projectId");
                    String name = rs.getString("projectName");
                    String desc = rs.getString("projectDesc");
                    String status = rs.getString("projectStatus");

                    Projects projectDetails = new Projects(id, name, desc, status);
                    projectList.add(projectDetails);
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return projectList;

    }
}
