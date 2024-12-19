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
public class AddSubscribers {

    public boolean isSubscribed(String email) throws SQLException {

        boolean subscribed = false;
        int i = 0;
        if (!email.trim().equals("")) {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO flipr.subscriptions(sub_email,sub_date) VALUES(?,CURRENT_DATE());");
//            pst.setString(1, );
            pst.setString(1, email);
//            pst.setDate(3,);
            

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
