package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.repository.EventRepository;
import com.btrco.projects.evemap.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event addEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public List<Event> getListOfEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event updateEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    @Override
    public void deleteEvent(Event event) {
        eventRepository.delete(event);
    }

    @Override
    public Event getEventById(long id) {
        return eventRepository.findOne(id);
    }

    @Override
    public Event getEventByName(String event) {
        return eventRepository.findOneByName(event);
    }

    @Override
    public List<Event> getEventsByDate(LocalDateTime dateTime) {
        //TODO: find by date only
        return eventRepository.findAllByDate(dateTime);
    }

    @Override
    public List<Event> getEventsByCreator(User creator) {
        return eventRepository.findAllByCreator(creator);
    }

    @Override
    public List<Event> getEventsByLocation(Location location) {
        return eventRepository.findAllByLocation(location);
    }
}
