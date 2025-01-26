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

    public boolean isRegister(String name, String email, String password,String phone_no) throws SQLException {
        boolean register;

        int i = 0;
        if (!name.trim().equals("") && !email.trim().equals("") && (password.trim().length() >= 8)&& phone_no.length()==10) {
            System.out.println(name);
            System.out.println(email);

            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO flipr.clients(name,email,password,phone_no) VALUES(?,?,?,?);");

            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4,phone_no);

            i = pst.executeUpdate();
            System.out.println(i);

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
