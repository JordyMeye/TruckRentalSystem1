//Domain  Customer class
// Pojo Customer
// Author: Jordy Meye (220072841)
// Date: 10 06 2023
package za.ac.cput.service;

import za.ac.cput.domain.Customer;

import java.util.Set;

public interface CustomerService extends  IService <Customer, String>{


 Customer create(Customer customerId);

 Customer read(String customerId);

 Customer update(Customer customer);

 void delete(String customerId);

 Set<Customer> getAll();


 //Customer findByEmail(String email);
}
