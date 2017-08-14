package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query("SELECT a FROM address a WHERE a.city = :city")
    List<Address> findAllByCityName(@Param("city") String city);

    @Query("SELECT a FROM address a WHERE a.state = :state")
    List<Address> findAllByStateName(@Param("state") String state);

    @Query("SELECT a FROM address a WHERE a.country = :country")
    List<Address> findAllByCountryName(@Param("country") String country);

    @Query("SELECT a FROM address a WHERE a.street = :street")
    List<Address> findAllByStreetName(@Param("street") String street);

    @Query("SELECT a FROM address a WHERE a.buildingNumber = :buildingNumber")
    List<Address> findAllByBuildingNumber(@Param("buildingNumber") String buildingNumber);
}
