package com.btrco.projects.evemap.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Address {

    @Id
    @GeneratedValue(generator = "increment")
    private long id;

    private String country;

    private String state;

    private String city;

    private String street;

    private String buildingNumber;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Location> locationsOnThisAddress;
}
