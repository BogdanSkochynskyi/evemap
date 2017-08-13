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

    List<Event> getListOfEvents(int firstRow, int lastRow);

    boolean updateEvent(Event event);

    boolean deleteEvent(Event event);

    Event getEventById(int id);

    Event getEventByName(String event);

    List<Event> getEventsByDate(LocalDateTime dateTime);

    List<Event> getEventsByCreator(User creator);

    List<Event> getEventsByLocation(Location location);

    //TODO: add get list of events by type
}
