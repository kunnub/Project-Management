/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokerPanel.model;

/**
 *
 * @author HP
 */
public class Brokers {
    
    private int brokerId;
    private String brokerName;
    private int brokerNo;
    private String brokerMail;
    private String joiningDate;
    
    public Brokers(int brokerId,String brokerName,int brokerNo,String brokerMail,String joiningDate){
        
        this.setBrokerId(brokerId);
        this.setBrokerName(brokerName);
        this.setBrokerNo(brokerNo);
        this.setBrokerMail(brokerMail);
        this.setJoiningDate(joiningDate);
        
    }

    /**
     * @return the brokerId
     */
    public int getBrokerId() {
        return brokerId;
    }

    /**
     * @param brokerId the brokerId to set
     */
    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * @return the brokerName
     */
    public String getBrokerName() {
        return brokerName;
    }

    /**
     * @param brokerName the brokerName to set
     */
    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    /**
     * @return the brokerNo
     */
    public int getBrokerNo() {
        return brokerNo;
    }

    /**
     * @param brokerNo the brokerNo to set
     */
    public void setBrokerNo(int brokerNo) {
        this.brokerNo = brokerNo;
    }

    /**
     * @return the brokerMail
     */
    public String getBrokerMail() {
        return brokerMail;
    }

    /**
     * @param brokerMail the brokerMail to set
     */
    public void setBrokerMail(String brokerMail) {
        this.brokerMail = brokerMail;
    }

    /**
     * @return the joiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    
    
}
