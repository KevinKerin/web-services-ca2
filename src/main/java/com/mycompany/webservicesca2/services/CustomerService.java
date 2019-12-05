
package com.mycompany.webservicesca2.services;

import com.mycompany.webservicesca2.models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author
 */

public class CustomerService {

	private static List<Customer> customerList = new ArrayList<>();

	public static boolean init = true;

	public CustomerService() {

		if (init) {

			Customer kevin = new Customer("Kevin", "Kerin", "Ballymac", "Tralee", "Kerry", "kevin@gmail.com");
			Customer johnathan = new Customer("Johnathan", "Munster", "Drogheda", "Louth", "Louth",
					"johnathan@gmail.com");
			Customer niall = new Customer("Niall", "Kelly", "Rathfarnham", "Dublin", "Dublin", "niall@gmail.com");

			customerList.add(kevin);
			customerList.add(johnathan);
			customerList.add(niall);

			init = false;
		}
	}

	public List<Customer> getAllCustomers() {
		return customerList;
	}

	public Customer getCustomer(int id) {
		return customerList.get(id - 1);
	}

	public Customer createCustomer(Customer c) {
		c.setCustomerId(customerList.size() + 1);
		customerList.add(c);

		System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getCustomerId()));

		return c;
	}

}
