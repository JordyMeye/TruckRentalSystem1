//Admin Service Implementation
//Author: Chenique Jacobs (220388172)
//Date: 14/06/2023
package za.ac.cput.service.impl;

import za.ac.cput.domain.Admin;
import za.ac.cput.repository.impl.AdminRepository;
import za.ac.cput.service.AdminService;

import java.util.Set;

public class AdminServiceImpl implements AdminService {

    private static AdminServiceImpl service = null;
    private AdminRepository repository = null;

    private AdminServiceImpl(){
        repository = AdminRepository.getRepository();
    }

    private static AdminServiceImpl getService(){
        if (service ==null){
            service = new AdminServiceImpl();
        }
        return service;
    }

    @Override
    public Admin create(Admin admin) {
        Admin created = repository.create(admin);
        return created;
    }

    @Override
    public Admin read(String adminId) {
        Admin read = repository.read(adminId);
        return read;
    }

    @Override
    public Admin update(Admin admin) {
        Admin updated = repository.update(admin);
        return updated;
    }

    @Override
    public boolean delete(String adminId) {
        boolean success = repository.delete(adminId);
        return success;
    }

    @Override
    public Set<Admin> getAll() {
        return repository.getAll();
    }
}
