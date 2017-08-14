package com.btrco.projects.evemap.service;

import com.btrco.projects.evemap.model.Location;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public interface ILocationService {

    Location addLocation(Location location);

    List<Location> gerListOfLocations();

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Location getLocationByName(String name);

    Location getLocationById(long id);

    List<Location> getLocationsByCoordinates(String coordinates);

}
