package com.btrco.projects.evemap.service;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public interface IEventService {

    Event addEvent(Event event);

    List<Event> getListOfEvents();

    Event updateEvent(Event event);

    void deleteEvent(Event event);

    Event getEventById(long id);

    Event getEventByName(String event);

    List<Event> getEventsByDate(LocalDateTime dateTime);

    List<Event> getEventsByCreator(User creator);

    List<Event> getEventsByLocation(Location location);

    //TODO: add get list of events by type
}
