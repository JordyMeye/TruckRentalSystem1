//Interface Customer Repository
// Interface
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.repository;

import za.ac.cput.domain.Customer;

import java.util.Set;

public interface ICustomerRepository extends IRepository<Customer, String>{
    boolean delete();

    //create, read, delete
    public Set<Customer> getAll();
}
