package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.service.IAddressService;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public class AdressService implements IAddressService {
    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public List<Address> getListOfAddresses() {
        return null;
    }

    @Override
    public List<Address> getListOfAddresses(int firstRow, int lastRow) {
        return null;
    }

    @Override
    public boolean updateAddress(Address address) {
        return false;
    }

    @Override
    public boolean deleteAddress(Address address) {
        return false;
    }

    @Override
    public List<Address> getListOfAddressesByCityName(String cityName) {
        return null;
    }

    @Override
    public List<Address> getListOfAddressesByStateName(String stateName) {
        return null;
    }

    @Override
    public List<Address> getListOfAddressesByCountryName(String countryName) {
        return null;
    }

    @Override
    public List<Address> getListOfAddressesByStreetName(String streetName) {
        return null;
    }

    @Override
    public List<Address> getListOfAddressesByBuildingNumber(String buildingNumber) {
        return null;
    }

    @Override
    public Address getAddressById(int id) {
        return null;
    }
}
