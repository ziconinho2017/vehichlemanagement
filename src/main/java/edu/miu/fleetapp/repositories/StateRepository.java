package edu.miu.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.fleetapp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
