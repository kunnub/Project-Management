/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Buyers;
import model.Projects;

/**
 *
 * @author HP
 */
public class GetBuyerForEdit {

    public Buyers getBuyerById(int buyerId) {

        System.out.println("buyerId in getBuyerById " + buyerId);
        Buyers buyer = null;
        try {

            String query = "SELECT * FROM flipr.buyers WHERE buyerId = ?";

            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, buyerId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
//                String buyerId=rs.getString("buyerId");
                int clientId = Integer.parseInt(rs.getString("buyer_clientId"));
                String requirement = rs.getString("req_specifications");
                String budget = rs.getString("budget");
                
                String projectIdStr = rs.getString("buyer_projectId");
                int projectId = (projectIdStr != null && !projectIdStr.isEmpty()) ? Integer.parseInt(projectIdStr) : 0;
                
                int brokerId = Integer.parseInt(rs.getString("buyer_brokerId"));

                buyer = new Buyers(buyerId, clientId, requirement, budget, projectId, brokerId);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return buyer;
    }
}
