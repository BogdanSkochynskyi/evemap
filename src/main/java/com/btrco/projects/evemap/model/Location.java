package com.btrco.projects.evemap.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Data
@Document
public class Location {

    @Id
    @GeneratedValue(generator = "increment")
    private long id;

    //TODO: parsing of this coordinates
    private String coordinates;

    @ManyToOne
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    private String name;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Event> eventsInThisLocation;

}
