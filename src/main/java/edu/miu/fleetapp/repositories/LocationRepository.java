package edu.miu.fleetapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.fleetapp.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
