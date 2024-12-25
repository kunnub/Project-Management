package model;

import database.DBConnection;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

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

    public boolean isAdded(String name, String desc, String status, String imageName) {
        System.out.println("isAdded method called");
        String query = "INSERT INTO flipr.projects(projectName,projectDesc,projectImg,projectStatus) VALUES(?,?,?,?)";
//        String imageName = null;

        if (imageName != null) {

            if (!name.trim().equals("") && !desc.trim().equals("") && !status.trim().equals("")) {

                try {
                    Connection con = DBConnection.getConnection();
                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, name);
                    pst.setString(2, desc);
                    pst.setString(4, imageName);
                    pst.setString(3, status);

                    int i = pst.executeUpdate();
                    System.out.println("value of i is  " + i);

                    if (i > 0) {
                        return true;
                    } else {
                        return false;
                    }
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }

        }
        return false;

    }

}
