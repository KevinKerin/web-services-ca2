
package com.mycompany.webservicesca2.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 
 */
@XmlRootElement
public class Account {

    private int sortCode;
    private long accountNumber;
    private String accountType;
    private double balance;
    private List<Transaction> transactionList;

    public Account(){
        
    }
    
    public Account(int sortCode, long accountNumber, String accountType, long customerId) {
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
        transactionList = new ArrayList<>();
    }

    public int getSortCode() {
        return sortCode;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getTransactionList() {
        String result = "[";
        for (Transaction a : transactionList) {
            result += "Date: " + a.getDate() + ", Type: " + a.getTransactionType() + ", Amount: " + a.getAmount() + ", Description: " + a.getDescription() + ", Balance: " + a.getNewBalance() + "]\n";
        }
        return result;
    }

    public void newTransaction(String transactionType, double amount, String description) {
        Transaction t = new Transaction(transactionType, amount, description, balance);
        this.balance = t.getNewBalance();
        transactionList.add(t);
    }

}
