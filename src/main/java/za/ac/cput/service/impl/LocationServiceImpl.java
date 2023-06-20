/*Ayanda Phumzile Khoza
  Student 218057172*/


package za.ac.cput.service.impl;

import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Location;
import za.ac.cput.repository.impl.LocationRepository;
import za.ac.cput.service.LocationService;

import java.util.Set;

public class LocationServiceImpl implements LocationService {

    private static LocationServiceImpl service = null;
    private LocationRepository repository = null;

    private  LocationServiceImpl(){ repository = LocationRepository.getRepository();

    }
    public static LocationServiceImpl getService(){
        if(service == null){
            service = new LocationServiceImpl();
        }
        return service;
    }
    @Override
    public Location create(Location location) {
        Location created = repository.create(location);
        return created;
    }

    @Override
    public Location read(Integer locationId) {
        Location read = repository.read(locationId);
        return read;

    }

    @Override
    public Location update(Location location) {
        Location updated = repository.update(location);
        return updated;
    }

    @Override
    public boolean delete(Integer id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<Location> getAll(){
        return repository.getAll();
    }

}



