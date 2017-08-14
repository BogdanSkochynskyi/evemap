package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Event;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.repository.LocationRepository;
import com.btrco.projects.evemap.service.IEventService;
import com.btrco.projects.evemap.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
@Service
public class LocationService implements ILocationService{

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location addLocation(Location location) {
        return locationRepository.saveAndFlush(location);
    }

    @Override
    public List<Location> gerListOfLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.saveAndFlush(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location getLocationByName(String name) {
        return locationRepository.findOneByName(name);
    }

    @Override
    public Location getLocationById(long id) {
        return locationRepository.findOne(id);
    }

    @Override
    public List<Location> getLocationsByCoordinates(String coordinates) {
        return locationRepository.findAllByCoordinates(coordinates);
    }
}
