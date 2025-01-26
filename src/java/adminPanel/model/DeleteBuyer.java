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
public class DeleteBuyer {
    public boolean deleteBuyer(int buyerId) throws SQLException {
        int rowsAffected = 0;
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("DELETE FROM flipr.buyers WHERE buyerId = ?");
        pst.setInt(1, buyerId);

        rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            return true;
        } else {
            return false;
        }

    }
}
