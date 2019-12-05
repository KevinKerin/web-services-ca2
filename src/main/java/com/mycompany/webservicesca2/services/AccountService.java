
package com.mycompany.webservicesca2.services;

import com.mycompany.webservicesca2.models.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class AccountService {
    
    List<Account> accountList = new ArrayList<>();
    
    public AccountService(){
    	
    	Account acc1 = new Account(990, 000L, "savings", 1001);
    	Account acc2 = new Account(990, 001L, "deposit", 1001);
    }
    
    
    
    
}
