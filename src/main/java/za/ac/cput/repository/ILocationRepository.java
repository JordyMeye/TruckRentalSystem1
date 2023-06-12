package za.ac.cput.repository;
/*Ayanda Phumzile Khoza
 Student Number 218057172
 */

import za.ac.cput.domain.Location;

import java.util.Set;

public interface ILocationRepository extends IRepository<Location ,Integer> {

    public Set<Location> getAll();

}




