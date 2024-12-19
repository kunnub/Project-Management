/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class GetUserDetails {

    public List<Users> getUserDetails() throws SQLException {
        List<Users> userList = new ArrayList<>();

        // SQL query to fetch user details without the password
        String query = "SELECT user_id, name, email FROM flipr.clients";

        // Use try-with-resources for automatic resource management
        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery()) {

            // Check if the table is empty
            if (!rs.isBeforeFirst()) {
                System.out.println("No users found in the database.");
            } else {
                // Iterate through the result set and add user details to the list
                while (rs.next()) {
                    int userId = rs.getInt("user_id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");

                    // Create a Users object and add it to the list
                    Users userInfo = new Users(userId, name, email);
                    userList.add(userInfo);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Re-throw the exception for higher-level handling
        }

        return userList;
    }
}
