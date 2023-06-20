/*Ayanda Phumzile Khoza
Student Number 218057172*/
package za.ac.cput.service.impl;

import za.ac.cput.domain.Brand;
import za.ac.cput.repository.impl.BrandRepository;
import za.ac.cput.service.BrandService;

import java.util.Set;

public class BrandServiceImpl implements BrandService {

    private static BrandServiceImpl service = null;
    private BrandRepository repository = null;

    private BrandServiceImpl(){repository = BrandRepository.getRepository();}

    public static BrandServiceImpl getService(){
        if(service == null){
            service = new BrandServiceImpl();
        }
        return service;
    }


    @Override
    public Brand create(Brand brand) {
        Brand created = repository.create(brand);
        return created;
    }

    @Override
    public Brand read(Integer brandId) {
        Brand read = repository.read(brandId);
        return read;
    }

    @Override
    public Brand update(Brand brand) {
        Brand updated = repository.update(brand);
        return updated;
    }

    @Override
    public boolean delete(Integer id) {
        boolean success = repository.delete(id);
        return success;
    }

    public Set<Brand> getAll(){
        return repository.getAll();
    }
}
