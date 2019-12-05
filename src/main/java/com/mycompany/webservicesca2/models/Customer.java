
package com.mycompany.webservicesca2.models;

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
    private Long id;
    //
    private Map<String, Account> accounts = new HashMap<>();
    //
    private List<Account> accountList;
    private long customerId = 000L;
    
	public Customer() {  }

    public Customer(long id, String firstName, String lastName, String email) {
    	this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
      //  this.addressLine1 = "n/a";
      //  this.addressLine2 = "n/a";
      //  this.addressLine3 = "n/a";
    
       // this.accountList = new ArrayList<>();  
        
        // this.accounts.put("000L", new Account());
        
       
        
       // createAccount(100L, 001, 999L, "accountType");
    }

    
    /*  public Customer(String firstName, String lastName, String addressLine1, String addressLine2, String addressLine3, String email) {
     
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.email = email;
        accountList = new ArrayList<>();
    }
    */
    
    
    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
    
    
    
   
    
    /*
    public void createAccount(long customerId, int sortCode, long accountNumber, String accountType) {
    	
    	String newcustomerId = Long.toString(customerId);
    	newcustomerId = newcustomerId + "_" + Long.toString(accountNumber);
    	
    	System.out.println(newcustomerId);
    	
    	if(!accounts.containsKey(newcustomerId)) {
    		accounts.put(newcustomerId, new Account(sortCode, accountNumber, accountType, customerId));
    	}
    	else {
    		System.out.println("Account already exists");
    	}
    }
    */
    
}
















