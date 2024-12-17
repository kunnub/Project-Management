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
public class GetUserDetails {

    public List<Users> getUserDetails() throws SQLException {
        List<Users> userList = new ArrayList<>();

        String query = "SELECT client_id, name,email FROM flipr.clients;";

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        if (rs.isBeforeFirst()) {
            System.out.println("table is empty");
        } else {
            while (rs.next()) {
                int client_id=rs.getInt("client_id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                Users userInfo = new Users(client_id,name, email);
                userList.add(userInfo);

            }
        }
        return userList;
    }
}
