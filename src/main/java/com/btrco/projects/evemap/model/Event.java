package com.btrco.projects.evemap.model;

import com.btrco.projects.evemap.model.enums.EventType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Document
public class Event {

    @Id
    @GeneratedValue(generator = "increment")
    private long id;

    private String name;

    private String shortDescription;

    private String fullDescription;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User creator;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    private String webLink;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

}
