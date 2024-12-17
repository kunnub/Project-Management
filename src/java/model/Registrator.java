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
public class Registrator {

    public boolean isRegister(String name, String email, String password) throws SQLException {
        boolean register;

        int i = 0;
      if (!name.trim().equals("") && !email.trim().equals("") && (password.trim().length() >= 8)) {

            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO flipr.clients(name,email,password) VALUES(?,?,?);");

            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, password);

            i = pst.executeUpdate();

            if (i > 0) {

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
