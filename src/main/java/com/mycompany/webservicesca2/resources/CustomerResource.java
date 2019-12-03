/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webservicesca2.resources;

import com.mycompany.webservicesca2.models.Customer;
import javax.ws.rs.core.MediaType;
import com.mycompany.webservicesca2.services.CustomerService;
import java.util.List;
import javax.enterprise.inject.Produces;
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author kevinkerin
 */
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {
 
    CustomerService customerService = new CustomerService();
    
    @GET
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    
}


