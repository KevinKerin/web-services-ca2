
package com.mycompany.webservicesca2.resources;

import com.mycompany.webservicesca2.models.Customer;
import com.mycompany.webservicesca2.services.CustomerService;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
 
    CustomerService customerService = new CustomerService();
    
    @GET
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }
    
    @GET
    @Path("/{customerId}")
    public Customer getCustomer(@PathParam("customerId") int id) {
        return customerService.getCustomer(id);
    }
   
    
    @Path("/{customerId}/accounts")
	public AccountResource getCommentResource() {
		return new AccountResource();
	}
    
}