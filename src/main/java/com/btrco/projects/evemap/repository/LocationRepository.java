package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {
}
