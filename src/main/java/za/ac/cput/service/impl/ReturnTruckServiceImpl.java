//ReturnTruck Service Interface
//Author: Chenique Jacobs (220388172)
//Date: 13/06/2023
package za.ac.cput.service.impl;

import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.repository.impl.ReturnTruckRepository;
import za.ac.cput.service.ReturnTruckService;

import java.util.Set;

public class ReturnTruckServiceImpl implements ReturnTruckService {
    private static ReturnTruckServiceImpl service = null;
    private ReturnTruckRepository repository = null;

    private ReturnTruckServiceImpl(){
        repository = ReturnTruckRepository.getRepository();
    }

    public static ReturnTruckServiceImpl getService(){
        if (service==null){
            service = new ReturnTruckServiceImpl();
        }
        return service;
    }

    @Override
    public ReturnTruck create(ReturnTruck returnTruck) {
        ReturnTruck created = repository.create(returnTruck);
        return created;
    }

    @Override
    public ReturnTruck read(String returnId) {
        ReturnTruck read = repository.read(returnId);
        return read;
    }

    @Override
    public ReturnTruck update(ReturnTruck returnTruck) {
        ReturnTruck updated = repository.update(returnTruck);
        return updated;
    }

    @Override
    public boolean delete(String returnId) {
        boolean success = repository.delete(returnId);
        return success;
    }

    @Override
    public Set<ReturnTruck> getAll() {
        return repository.getAll();
    }
}
