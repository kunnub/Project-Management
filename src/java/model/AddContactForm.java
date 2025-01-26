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
public class AddContactForm {

    public boolean isContacted(String name, String email, String phno, String query,String address) {

        boolean contacted = false;
        int i = 0;
        if (!name.trim().isEmpty() && !email.trim().isEmpty() && !phno.trim().isEmpty() && !query.trim().isEmpty() && !address.trim().isEmpty()) {
//            System.out.println("values are not fetched properly");
            try {
                Connection con = DBConnection.getConnection();
                PreparedStatement pst = con.prepareStatement("INSERT INTO flipr.contact_form (client_name,client_email,client_phno,client_add,client_query)VALUES (?,?,?,?,?);");

                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, phno);
                pst.setString(4, address);
                pst.setString(5,query);

                i = pst.executeUpdate();
//               System.out.println("Rows affected: " + i);
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
