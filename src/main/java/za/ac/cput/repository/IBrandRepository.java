package za.ac.cput.repository;
/*Author Ayanda Phumzile Khoza
Student Number 218057172
 */

import za.ac.cput.domain.Brand;

import java.util.Set;

public interface IBrandRepository extends IRepository<Brand, String>
{


    Brand read();

    Brand read(Integer BrandId);

    Set<Brand> getAll();

    
}
