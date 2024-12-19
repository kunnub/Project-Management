/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class LoginAuthenticator {

    public boolean isLogin(String email, String password) throws SQLException {
        String query = "SELECT password FROM flipr.clients WHERE email = ?";
        String userPass = null;

        try (PreparedStatement ps = DBConnection.getConnection().prepareStatement(query)) {
            ps.setString(1, email); 
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    userPass = rs.getString(1); // Retrieve the password
                }
            }
            System.out.println("Retrieved password from DB: " + userPass);

        }

        // Check if the provided password matches the one from the database
        boolean login = email != null && password != null
                && !email.trim().isEmpty()
                && password.equals(userPass);

//        System.out.println("Login result for email: " + email + " is " + login);
        return login;

    }

}
