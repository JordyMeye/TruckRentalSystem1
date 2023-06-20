//ReturnTruck Service Interface
//Author: Chenique Jacobs (220388172)
//Date: 13/06/2023
package za.ac.cput.service;

import za.ac.cput.domain.ReturnTruck;

import java.util.Set;

public interface ReturnTruckService extends IService<ReturnTruck, String> {
public Set<ReturnTruck> getAll();
}
