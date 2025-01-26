/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminPanel.model;

import database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ContactDetails;

/**
 *
 * @author HP
 */
public class GetContactDetails {

    public List<ContactDetails> FetchContacts() throws SQLException {
        System.out.println("fetching contacts started");
        List<ContactDetails> contactList = new ArrayList<>();

        String query = "SELECT * FROM flipr.contact_form;";

        Connection con = DBConnection.getConnection();

        System.out.println("conection established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("resultset value  " + rs);
        System.out.println("Executing query: " + query);

        if (!rs.isBeforeFirst()) {
            System.out.println("table is empty");
        } else {
            while (rs.next()) {
                int id = rs.getInt("client_id");
                String name = rs.getString("client_name");
                String email = rs.getString("client_email");
                String phone_no = rs.getString("client_phno");
                String client_query=rs.getString("client_query");
                String address = rs.getString("client_add");
                String isConsulted=rs.getString("isConsulted");
                String result=rs.getString("result");
                String broker =rs.getString("brokerAssigned");

                System.out.println(id);

                ContactDetails contactInfo = new ContactDetails(id, name, email, phone_no, client_query,address,isConsulted,result,broker);
                contactList.add(contactInfo);

//                for(ContactDetails contact:contactList){
//                    System.out.p rintln(contact);
//                }
            }
        }
        return contactList;

    }
}
