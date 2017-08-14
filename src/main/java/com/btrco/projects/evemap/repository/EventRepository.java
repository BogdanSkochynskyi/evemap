package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface EventRepository extends JpaRepository<Event, Long> {
}
