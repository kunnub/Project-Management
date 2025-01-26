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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class GetBuyers {

    public List<Buyers> getBuyers()

    {

        List<Buyers> buyerList = new ArrayList<>();

        String query = "SELECT * FROM flipr.buyers;";

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (!rs.isBeforeFirst()) {
                System.out.println("the table is empty");
            } else {
                while (rs.next()) {

                    int buyerId = rs.getInt("buyerId");
                    int b_clientId = rs.getInt("buyer_clientId");
                    String requirement = rs.getString("req_specifications");
                    String budget = rs.getString("budget");
                    int b_projectId = rs.getInt("buyer_projectId");
                    int b_brokerId = rs.getInt("buyer_brokerId");
                    
//                    System.out.println(requirement + "GetBuyer.java");
                    
                    Buyers buyerDetails = new Buyers(buyerId, b_clientId, requirement, budget, b_projectId, b_brokerId);

                    buyerList.add(buyerDetails);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetBuyers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buyerList;
        
    }
}

