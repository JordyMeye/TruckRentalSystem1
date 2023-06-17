package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Brand;
import za.ac.cput.domain.Location;
import za.ac.cput.repository.impl.BrandRepository;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BrandFactoryTest {

    @Test
    public void createBrand() {

        Brand brand = BrandFactory.createBrand( 353,"UD Truck","Pick up truck","Black");

         assertNotNull(brand);
        System.out.println(brand);
    }
       @Test
    public void readBrand(){
        Brand brand = BrandRepository.getRepository().read(353);
           System.out.println(brand);
       }


//    @Test
//    public void updateBrand(){
//        Brand brand = brandFactory.createBrand(353,"Limpopo", "Plein Street" );
//        location.
//        System.out.println(brand);
//    }

    @Test
    public void deleteBrand()

    {
        boolean isBrandDeleted = BrandRepository.getRepository().delete(Integer.valueOf(353));
        System.out.println(353);

    }
    @Test
    public void getAll()
    {
        var allBrand = BrandRepository.getRepository().getAll();
        int dbSize = allBrand.size();
        System.out.println(dbSize);



    }



}
