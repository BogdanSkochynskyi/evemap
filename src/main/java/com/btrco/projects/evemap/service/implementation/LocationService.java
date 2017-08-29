package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.model.Location;
import com.btrco.projects.evemap.repository.LocationRepository;
import com.btrco.projects.evemap.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService implements ILocationService{

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location addLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> gerListOfLocations() {
        List<Location> locations = new ArrayList<>();
        locationRepository.findAll().forEach(locations :: add);
        return locations;
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

//    @Override
//    public Location getLocationByName(String name) {
//        return locationRepository.findByName(name);
//    }

    @Override
    public Location getLocationById(long id) {
        return locationRepository.findOne(id);
    }

//    @Override
//    public List<Location> getLocationsByCoordinates(String coordinates) {
//        return locationRepository.findByCoordinates(coordinates);
//    }
}
