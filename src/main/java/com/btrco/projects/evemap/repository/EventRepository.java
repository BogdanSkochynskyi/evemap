package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

    Event findByName(String name);

    //TODO: find only by date
    List<Event> findByDateTime(LocalDateTime dateTime);

    List<Event> findByCreator(User creator);

    List<Event> findByLocation(Location location);
}
