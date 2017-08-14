package com.btrco.projects.evemap.model;

import com.btrco.projects.evemap.model.enums.EventType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by BTRco on 13.08.2017.
 */
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "full_description")
    private String fullDescription;

    @Column(name = "date_time", nullable = false)
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User creator;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @Column(name = "web_link")
    private String webLink;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    public Event() {
    }

    public Event(String name, String shortDescription, String fullDescription, LocalDateTime dateTime, User creator, Location location, String webLink, EventType eventType) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.dateTime = dateTime;
        this.creator = creator;
        this.location = location;
        this.webLink = webLink;
        this.eventType = eventType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
