/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class AddBuyers {

    public boolean isAdded( String buyer_clientId, String req_specifications, String budget, String buyer_projectId,String buyer_brokerId) {

        String query = "INSERT INTO flipr.buyers(buyer_clientId,req_specifications,budget,buyer_projectId,buyer_brokerId) VALUES(?,?,?,?,?);";

        if (!buyer_clientId.trim().equals("") && !req_specifications.trim().equals("") && !buyer_brokerId.trim().equals("")) {

            System.out.println(buyer_projectId);
            System.out.println(budget);
            if(buyer_projectId==""){
                buyer_projectId=null;
            }
            try {
                Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, buyer_clientId);
                pst.setString(2, req_specifications);
                pst.setString(3, budget);
                pst.setString(4, buyer_projectId);
                pst.setString(5,buyer_brokerId);

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
        return false;
    }
}