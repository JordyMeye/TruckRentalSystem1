//Ayanda Phumzile Khoza
//Student Number 218057172

package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Brand;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.BrandFactory;
import za.ac.cput.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BrandServiceImplTest {

    private static BrandServiceImpl service = null;
    private static Brand brand = BrandFactory.createBrand(Integer.parseInt("353"), "UD truck", "Pick up Truck" , "Black");


    public BrandServiceImplTest() {service = BrandServiceImpl.getService();}
    @Test
    void a_create() {

        Brand created = service.create(brand);
        assertNotNull(created);
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Brand read2 = service.read(brand.getBrandId());
       // assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {

        Brand updated = new Brand.Builder().copy(brand).setBrandName("UD Truck").setModel("Pick up Truck").setColor("Black").build();
        //assertNotNull(service.update(updated));
        System.out.println("updated: " + updated);
    }

    @Test
    void e_delete() {

        boolean success = service.delete(brand.getBrandId());
       // assertTrue(success);
        System.out.println("deleted: " + success);

    }


    @Test
    void d_getAll() {
        System.out.println("show all: ");
        System.out.println(service.getAll());

    }
}


