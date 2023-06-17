//Ayanda Phumzile Khoza
//Student Number 218057172

package za.ac.cput.service.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Brand;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.BrandFactory;
import za.ac.cput.factory.LocationFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationServiceImplTest {
    private static LocationServiceImpl service = null;
    private static Location location = LocationFactory.createLocation(Integer.parseInt("353"), "UD truck", "Pick up Truck" , "Black");


    public LocationServiceImplTest() {service = LocationServiceImpl.getService();}


    @Test
    void a_create() {

        Location created = service.create(location);
        assertNotNull(created);
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Location read2 = service.read(location.getLocationId());
       // assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {

        Location updated = new Location.Builder().copy(location).setLocationName("Cape Town").setAddress("Pick up Truck").build();
       // assertNotNull(service.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {

        boolean success = service.delete(location.getLocationId());
        assertTrue(success);
        System.out.println("deleted: " + success);

    }


    @Test
    void d_getAll() {
        System.out.println("show all: ");
        System.out.println(service.getAll());

    }
}



