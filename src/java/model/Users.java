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
    private String phone_no;

    public Users(int user_id, String name, String email,String phone_no) {

        System.out.println("Users class called");

        this.setUser_id(user_id);
        this.setName(name);
        this.setEmail(email);
        this.setPhone_no(phone_no);

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

  
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    private void setPhone_no(String phone_no) {
        this.phone_no=phone_no;
    }

    /**
     * @return the phone_no
     */
    public String getPhone_no() {
        
        System.out.println(phone_no + "in users.java");
        return phone_no;
    }

}
