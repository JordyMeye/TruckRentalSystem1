//CustomerFactory Test.java
// Test for the Customer Factory
// Author: Jordy Meye (220072841)
// Date: 24 03 2023
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    public void createEmployee(){

        Customer customer = CustomerFactory.createEmployee("CDI" , "ray", "walker" , "ray@gmail.com" , "obs", "yzyzyyydy");
        assertNotNull(customer);
        System.out.println(customer);

    }
}