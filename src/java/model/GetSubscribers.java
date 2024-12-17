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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class GetSubscribers {

    public List<Subscriber> fetchSubscribers() throws SQLException {
        System.out.println("fetch subscription called");
        List<Subscriber> subscribers = new ArrayList<>();

        String query = "SELECT * FROM flipr.subscriptions"; // SQL query
//        System.out.println("executing query");

        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query); 

//            System.out.println("connection established...chk4");

        if (!rs.isBeforeFirst()) {  // Checks if the result set is empty
            System.out.println("ResultSet is empty.");
        } else {
            System.out.println("ResultSet contains data.");
        

        // Process the result set
        while (rs.next()) {
            int id = rs.getInt("sub_id");
            String email = rs.getString("sub_email");
            Timestamp subscriptionDate = rs.getTimestamp("sub_date");

            // Create a Subscriber object and add to the list
            Subscriber subscriber = new Subscriber(id, email, subscriptionDate);
            subscribers.add(subscriber);
//            System.out.println("subscribers added to the list...chk 5");
        }
        }

        return subscribers; // Return the list of subscribers
    }

}
