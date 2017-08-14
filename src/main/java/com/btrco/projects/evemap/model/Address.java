package com.btrco.projects.evemap.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "buildingNumber")
    private String buildingNumber;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Location> locationsOnThisAddress;

    public Address() {
    }

    public Address(String country, String state, String city, String street, String buildingNumber, List<Location> locationsOnThisAddress) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.locationsOnThisAddress = locationsOnThisAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public List<Location> getLocationsOnThisAddress() {
        return locationsOnThisAddress;
    }

    public void setLocationsOnThisAddress(List<Location> locationsOnThisAddress) {
        this.locationsOnThisAddress = locationsOnThisAddress;
    }
}
