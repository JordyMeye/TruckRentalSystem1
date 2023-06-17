/*Ayanda Phumzile Khoza
Student Number 218057172*/

package za.ac.cput.service;

import za.ac.cput.domain.Brand;

import java.util.Set;

public interface BrandService extends IService<Brand,Integer>
{
    public Set<Brand> getAll();
}
