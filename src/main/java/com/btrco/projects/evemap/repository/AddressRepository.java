package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends MongoRepository<Address, Long> {

    List<Address> findAllByCity(String city);

    List<Address> findByState(String state);

    List<Address> findByCountry(String country);

    List<Address> findByStreet(String street);

    List<Address> findByBuildingNumber(String buildingNumber);
}
