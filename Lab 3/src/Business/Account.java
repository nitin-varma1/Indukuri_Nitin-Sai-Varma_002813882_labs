/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.Date;

/**
 *
 * @author nitin
 */
public class Account {
    private int routingNumber;
    private int accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    public Account(){
        this.createdOn = new Date();
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return bankName;
    }
}
