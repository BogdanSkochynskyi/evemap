package com.btrco.projects.evemap.model;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public class User {

    private int id;

    private String name;

    private List<Event> createdEvents;

    private List<Event> eventsToVisit;

    private List<Event> visitedEvents;

    private String login;

    private String password;

    private String eMail;

    //TODO: add roles

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getCreatedEvents() {
        return createdEvents;
    }

    public void setCreatedEvents(List<Event> createdEvents) {
        this.createdEvents = createdEvents;
    }

    public List<Event> getEventsToVisit() {
        return eventsToVisit;
    }

    public void setEventsToVisit(List<Event> eventsToVisit) {
        this.eventsToVisit = eventsToVisit;
    }

    public List<Event> getVisitedEvents() {
        return visitedEvents;
    }

    public void setVisitedEvents(List<Event> visitedEvents) {
        this.visitedEvents = visitedEvents;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
