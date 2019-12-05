
package com.mycompany.webservicesca2.services;

import com.mycompany.webservicesca2.models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */

public class CustomerService {

	public static List<Customer> list = new ArrayList<>();

	public static boolean init = true;

	public CustomerService() {

		if (init) {

			Customer kevin = new Customer(1L, "Kevin", "Kerin", "kkkkkkkkkkevin@gmail.com");
			Customer johnathan = new Customer(2L, "Johnathan", "Munster", "jjjjjjjjjjjohnathan@gmail.com");
			Customer niall = new Customer(3L, "Niall", "Kelly", "nnnnnnnnnnnniall@gmail.com");

			list.add(kevin);
			list.add(johnathan);
			list.add(niall);

			init = false;
		}
	}

	public List<Customer> getAllCustomers() {
		return list;
	}
	
	public Customer getCustomer(int id) {
		return list.get(id - 1);
	}
	
	/*
	public Customer createCustomer(Customer c) {
		c.setCustomerId(list.size() + 1);
		list.add(c);

		System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getCustomerId()));

		return c;
	}
	
	*/

}
