package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.repository.impl.CustomerRepository;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerServiceImplTest {
    private static CustomerServiceImpl service = null;
    private static Customer customer = CustomerFactory.createEmployee("yzyzyyydy" , "ray", "walker" , "ray@gmail.com" , "obs", "yzyzyyydy");


    public CustomerServiceImplTest() {service = CustomerServiceImpl.getService();}
    @Test
    void a_create() {

        Customer created = service.create(customer);

        assertNotNull(created);
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Customer read2 = service.read(customer.getCustomerId());
        assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {


        Customer updated = new Customer.Builder().copy(customer).setName("Burger").setSurname("Naidoo").setEmail("Kruben@outlook.com").setAddress("rondebosch").setLicenseNumber("zggzgzgz").build();


        assertNotNull(service.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {

        boolean success = service.delete(customer.getCustomerId());
        assertTrue(success);
        System.out.println("deleted: " + success);

    }


    @Test
    void d_getAll() {
        System.out.println("show all: ");
        System.out.println(service.getAll());

    }
}