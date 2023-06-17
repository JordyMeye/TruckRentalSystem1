
/*Ayanda Phumzile Khoza
Student Number 218057172*/


package za.ac.cput.service;

import za.ac.cput.domain.Location;

import java.util.Set;

public interface LocationService extends IService<Location, Integer>
{
    public Set<Location> getAll();
}
