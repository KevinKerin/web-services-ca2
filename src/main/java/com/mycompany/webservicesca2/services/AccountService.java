
package com.mycompany.webservicesca2.services;

import com.mycompany.webservicesca2.models.Account;
import com.mycompany.webservicesca2.models.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class AccountService {
    
	public static List<Account> accountList = new ArrayList<>();
    
    public static boolean init = true;
    
    public AccountService() {
  
    	if (init) {
    	
    	Account acc1 = new Account(990, 000L, "savings", 1001);
    	Account acc2 = new Account(990, 001L, "deposit", 1002);
    	Account acc3 = new Account(990, 002L, "savings", 1003);
    	
    	accountList.add(acc1);
    	accountList.add(acc2);
    	accountList.add(acc3);
    	
    	init = false;
    	
    	}
    }
    
    public List<Account> getAllAccounts() {
    	return accountList;
	}
    
    public Account getAccount(int id) {
		return accountList.get(id - 1);
	}
}