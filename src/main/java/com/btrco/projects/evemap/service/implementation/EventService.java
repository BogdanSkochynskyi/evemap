package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.service.IEventService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public class EventService implements IEventService {
    @Override
    public Event addEvent(Event event) {
        return null;
    }

    @Override
    public List<Event> getListOfEvents() {
        return null;
    }

    @Override
    public List<Event> getListOfEvents(int firstRow, int lastRow) {
        return null;
    }

    @Override
    public boolean updateEvent(Event event) {
        return false;
    }

    @Override
    public boolean deleteEvent(Event event) {
        return false;
    }

    @Override
    public Event getEventById(int id) {
        return null;
    }

    @Override
    public Event getEventByName(String event) {
        return null;
    }

    @Override
    public List<Event> getEventsByDate(LocalDateTime dateTime) {
        return null;
    }

    @Override
    public List<Event> getEventsByCreator(User creator) {
        return null;
    }

    @Override
    public List<Event> getEventsByLocation(Location location) {
        return null;
    }
}
