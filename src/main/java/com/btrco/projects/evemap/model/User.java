package com.btrco.projects.evemap.model;

import com.btrco.projects.evemap.model.enums.UserRole;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "creator", cascade = CascadeType.ALL)
    private List<Event> createdEvents;

//    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
//    private List<Event> eventsToVisit;

//    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
//    private List<Event> visitedEvents;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String eMail;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public User() {
    }

    public User(String name, List<Event> createdEvents, String login, String password, String eMail, UserRole role) {
        this.name = name;
        this.createdEvents = createdEvents;
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.role = role;
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

    public List<Event> getCreatedEvents() {
        return createdEvents;
    }

    public void setCreatedEvents(List<Event> createdEvents) {
        this.createdEvents = createdEvents;
    }

//    public List<Event> getEventsToVisit() {
//        return eventsToVisit;
//    }
//
//    public void setEventsToVisit(List<Event> eventsToVisit) {
//        this.eventsToVisit = eventsToVisit;
//    }
//
//    public List<Event> getVisitedEvents() {
//        return visitedEvents;
//    }
//
//    public void setVisitedEvents(List<Event> visitedEvents) {
//        this.visitedEvents = visitedEvents;
//    }

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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
