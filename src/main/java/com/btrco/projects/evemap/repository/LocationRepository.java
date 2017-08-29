package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Long> {

    Location findByName(String name);

    List<Location> findByCoordinates(String coordinates);
}
