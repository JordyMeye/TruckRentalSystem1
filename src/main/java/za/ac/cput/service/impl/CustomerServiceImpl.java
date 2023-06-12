//Domain  Customer class
// Pojo Customer
// Author: Jordy Meye (220072841)
// Date: 10 06 2023
package za.ac.cput.service.impl;

import za.ac.cput.domain.Customer;
import za.ac.cput.repository.impl.CustomerRepository;
import za.ac.cput.service.CustomerService;

import java.util.Set;

public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    private CustomerRepository repository = null ;

    private CustomerServiceImpl(){
        repository = CustomerRepository.getRepository();
    }

    public static CustomerServiceImpl getService(){
        if(service == null){
            service = new CustomerServiceImpl();
        }
        return service;
    }

    public Customer create ( Customer customer){
        Customer created = repository.create(customer);
        return  created;
    }

    @Override
    public Customer read(String customerId) {
        Customer read = repository.read(customerId);
        return read;
    }

    @Override
    public Customer update(Customer customer) {
        Customer updated = repository.update(customer);
        return updated;
    }

    public boolean delete ( String id){
        boolean success = repository.delete(id);
        return success ;
    }


    public Set<Customer> getAll(){return repository.getAll();}
}
