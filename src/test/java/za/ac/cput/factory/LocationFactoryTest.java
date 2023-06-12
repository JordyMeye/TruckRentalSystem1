package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;
import za.ac.cput.repository.LocationRepository;

public class LocationFactoryTest {

    @Test
    public void createLocation(){

        Location location = LocationFactory.createLocation(353,"Cape Town", "Plein Street" );

        System.out.println(location);
    }

    @Test
    public void readLocation(){

        Location location = LocationRepository.getRepository().read(353);
        System.out.println(location);

    }

//    @Test
//    public void updateLocation(){
//        Location location = LocationFactory.createLocation(353,"Limpopo", "Plein Street" );
//        location.
//        System.out.println(location);
//    }

    @Test
    public void deleteLocation()

    {
        boolean isLocationDeleted = LocationRepository.getRepository().delete(353);
        System.out.println(353);

    }
    @Test
    public void getAll()
    {
        var allLocations = LocationRepository.getRepository().getAll();
        int dbSize = allLocations.size();
        System.out.println(dbSize);



    }

}


