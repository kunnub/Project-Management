package model;


import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class AddProjects {

    public boolean isAdded(String name, String desc, String status) {
        System.out.println("isAdded method called");
        String query ="INSERT INTO flipr.projects(projectName,ProjectDesc,ProjectStatus) VALUES(?,?,?)";

        if (!name.trim().equals("") && !desc.trim().equals("") && !status.trim().equals("")) {

            try {
                Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, name);
                pst.setString(2, desc);
                pst.setString(3, status);
                

                int i = pst.executeUpdate();
                System.out.println("value of i is  "+ i);

                if (i > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }

        }
        return false;

    }

}
