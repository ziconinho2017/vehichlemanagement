package edu.miu.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.fleetapp.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
