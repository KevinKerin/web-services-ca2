
package com.mycompany.webservicesca2.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 
 */

// [TO-DO] Unsure about XMLRootElement line - please confirm
// [TO-DO] How to make ID incremental?

@XmlRootElement
public class Customer {

    private String firstName;
    private String lastName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String email;
    //
    private Map<Long, Account> accounts = new HashMap<>();
    //
    private List<Account> accountList;
    private int customerId;
    
	public Customer() {}

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        addressLine1 = "n/a";
        addressLine2 = "n/a";
        addressLine3 = "n/a";
        this.email = email;
        accountList = new ArrayList<>();  
    }

    public Customer(String firstName, String lastName, String addressLine1, String addressLine2, String addressLine3, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.email = email;
        accountList = new ArrayList<>();
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getAddress() {
        return addressLine1 + "\n" + addressLine2 + "\n" + addressLine3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setCustomerId(int customerId) {
  		this.customerId = customerId;
  	}
    
    public int getCustomerId(){
        return customerId;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public Account getAccount(String accountType) throws NullPointerException {
        try {
            for (Account a : accountList) {
                if (a.getAccountType().equalsIgnoreCase(accountType)) {
                    return a;
                }
            }
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Account not found");
        }
        return null;
    }

    public Account getAccount(int accountNumber) {
        for (Account a : accountList) {
            if (a.getAccountNumber() == accountNumber) {
                return a;
            }
        }
        return null;
    }

    public void createAccount(Account a) {
        accountList.add(a);
    }

}
