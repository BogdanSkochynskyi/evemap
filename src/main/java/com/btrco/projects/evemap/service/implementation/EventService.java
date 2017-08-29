package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.repository.EventRepository;
import com.btrco.projects.evemap.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> getListOfEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events :: add);
        return events;
    }

    @Override
    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Event event) {
        eventRepository.delete(event);
    }

    @Override
    public Event getEventById(long id) {
        return eventRepository.findOne(id);
    }

//    @Override
//    public Event getEventByName(String event) {
//        return eventRepository.findByName(event);
//    }
//
//    @Override
//    public List<Event> getEventsByDate(LocalDateTime dateTime) {
//        //TODO: find by date only
//        return eventRepository.findByDate(dateTime);
//    }
//
//    @Override
//    public List<Event> getEventsByCreator(User creator) {
//        return eventRepository.findByCreator(creator);
//    }
//
//    @Override
//    public List<Event> getEventsByLocation(Location location) {
//        return eventRepository.findByLocation(location);
//    }
}
