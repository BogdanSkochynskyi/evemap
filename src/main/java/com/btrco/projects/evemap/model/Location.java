package com.btrco.projects.evemap.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    //TODO: parsing of this coordinates
    @Column(name = "coordinates")
    private String coordinates;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Event> eventsInThisLocation;

    public Location() {
    }

    public Location(String coordinates, Address address, String name, List<Event> eventsInThisLocation) {
        this.coordinates = coordinates;
        this.address = address;
        this.name = name;
        this.eventsInThisLocation = eventsInThisLocation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
