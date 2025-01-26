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
public class Buyers {
    
    private int buyerId;
    private int b_clientId;
    private String req_specification;
    private String budget;
    private int b_projectId;
    private int b_brokerId;
    
    public Buyers( int buyerId ,int b_clientId,String requirement,String budget , int b_projectId ,int b_brokerId){
        this.setBuyerId(buyerId);
        this.setB_clientId(b_clientId);
        this.setRequirement(requirement);
        this.setBudget(budget);
        this.setB_projectId(b_projectId);
        this.setB_brokerId(b_brokerId);
        
        
    }

    /**
     * @return the buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }

    /**
     * @param buyerId the buyerId to set
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * @return the b_clientId
     */
    public int getB_clientId() {
        return b_clientId;
    }

    /**
     * @param b_clientId the b_clientId to set
     */
    public void setB_clientId(int b_clientId) {
        this.b_clientId = b_clientId;
    }

    /**
     * @return the req_specification
     */
    public String getRequirement() {
        return req_specification;
    }

    /**
     * @param req_specification the req_specification to set
     */
    public void setRequirement(String req_specification) {
        this.req_specification = req_specification;
    }

    /**
     * @return the budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * @return the b_projectId
     */
    public int getB_projectId() {
        return b_projectId;
    }

    /**
     * @param b_projectId the b_projectId to set
     */
    public void setB_projectId(int b_projectId) {
        this.b_projectId = b_projectId;
    }

    /**
     * @return the b_brokerId
     */
    public int getB_brokerId() {
        return b_brokerId;
    }

    /**
     * @param b_brokerId the b_brokerId to set
     */
    public void setB_brokerId(int b_brokerId) {
        this.b_brokerId = b_brokerId;
    }
    
}
