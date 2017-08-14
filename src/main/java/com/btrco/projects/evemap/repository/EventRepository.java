package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query("SELECT e FROM event e WHERE e.name = :name")
    Event findOneByName(@Param("name") String name);

    //TODO: find only by date
    List<Event> findAllByDate(LocalDateTime dateTime);

    @Query("SELECT e FROM event e WHERE e.creator = :creator")
    List<Event> findAllByCreator(@Param("creator") User creator);

    @Query("SELECT e FROM event e WHERE e.location = :location")
    List<Event> findAllByLocation(@Param("location")Location location);
}
