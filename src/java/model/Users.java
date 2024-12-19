package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Users {
    
    private int user_id;
    private String name;
    private String email;
    
    public Users(int user_id,String name ,String email){
        
        System.out.println("Users class called");
        
        this.setUser_id(user_id);
        this.setName(name);
        this.setEmail(email);
        
        
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the client_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param client_id the client_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    


}
