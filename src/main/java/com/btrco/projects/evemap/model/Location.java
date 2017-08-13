package com.btrco.projects.evemap.model;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public class Location {

    private int id;

    //TODO: parsing of this coordinates
    private String coordinates;

    private Address address;

    private String name;

    private List<Event> eventsInThisLocation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Event> getEventsInThisLocation() {
        return eventsInThisLocation;
    }

    public void setEventsInThisLocation(List<Event> eventsInThisLocation) {
        this.eventsInThisLocation = eventsInThisLocation;
    }
}
