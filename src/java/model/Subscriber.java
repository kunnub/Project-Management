/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author HP
 */
public class Subscriber {

    private int id;
    private String email;
    private Timestamp subscriptiondate;

    public Subscriber(int id, String email, Timestamp subscriptiondate) {
        this.id = id;
        this.email = email;
        this.subscriptiondate = subscriptiondate;

//        System.out.println("subscriber.java called");
//        
//        System.out.println(id);

    }


    /**
     * @return the id
     */
    public int getId() {
//        System.out.println("id value fetched ...chk1");
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the subscriptiondate
     */
    public Timestamp getSubscriptiondate() {
        return subscriptiondate;
    }

    /**
     * @param subscriptiondate the subscriptiondate to set
     */
    public void setSubscriptiondate(Timestamp subscriptiondate) {
        this.subscriptiondate = subscriptiondate;
    }

}
