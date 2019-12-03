/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicesca2.models;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kevinkerin
 */
//Unsure about XMLRootElement line - please confirm
@XmlRootElement
public class Transaction {
    
    private String transactionType;
    private Date date;
    private double amount;
    private String description;
    private double newBalance;

    public Transaction(String transactionType, double amount, String description, double initialBalance) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
        this.date = new Date();
        if(transactionType.equalsIgnoreCase("debit")){
            newBalance = initialBalance - amount;
        } else {
            newBalance = initialBalance + amount;
        }
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public double getNewBalance() {
        return newBalance;
    }
    
}
