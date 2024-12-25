/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP
 */
public class ContactDetails {

    private int id;
    private String name;
    private String email;
    private String phone_no;
    private String address;

    public ContactDetails(int id, String name, String email, String phone_no, String address) {
        System.out.println("helllooooo");
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
        this.setPhone_no(phone_no);
        this.setAddress(address);
    }

    /**
     * @return the id
     */
    public int getId() {
//        System.out.println("getId mthod called ");
//        System.out.println("id is "+id);
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the phone_no
     */
    public String getPhone_no() {
        return phone_no;
    }

    /**
     * @param phone_no the phone_no to set
     */
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
