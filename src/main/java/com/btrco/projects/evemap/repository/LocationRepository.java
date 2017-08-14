package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {

    @Query("SELECT l FROM location l WHERE l.name = :name")
    Location findOneByName(@Param("name") String name);

    @Query("SELECT l FROM location l WHERE l.coordinates = :coordinates")
    List<Location> findAllByCoordinates(@Param("coordinates") String coordinates);
}
