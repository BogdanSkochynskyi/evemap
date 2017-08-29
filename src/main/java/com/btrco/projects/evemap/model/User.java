package com.btrco.projects.evemap.model;

import com.btrco.projects.evemap.model.enums.UserRole;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Data
@Document
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    private long id;

    private String name;

    @OneToMany(mappedBy = "creator", cascade = CascadeType.ALL)
    private List<Event> createdEvents;

//    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
//    private List<Event> eventsToVisit;

//    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
//    private List<Event> visitedEvents;

    private String login;

    private String password;

    private String eMail;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}
