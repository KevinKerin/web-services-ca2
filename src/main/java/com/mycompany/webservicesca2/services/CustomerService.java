/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicesca2.services;

import com.mycompany.webservicesca2.models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevinkerin
 */
public class CustomerService {
    
    private List<Customer> customerList = new ArrayList<>();
    
    public CustomerService(){
        Customer kevin = new Customer("Kevin", "Kerin", "Ballymac", "Tralee", "Kerry", "kevin@gmail.com");
        Customer johnathan = new Customer("Johnathan", "Munster", "Drogheda", "Louth", "Louth", "johnathan@gmail.com");
        Customer niall = new Customer("Niall", "Kelly", "Rathfarnham", "Dublin", "Dublin", "niall@gmail.com");
        
        customerList.add(kevin);
        customerList.add(johnathan);
        customerList.add(niall);
    }
    
}
