package com.btrco.projects.evemap.service;

import com.btrco.projects.evemap.model.Address;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public interface IAddressService {

    Address addAddress(Address address);

    List<Address> getListOfAddresses();

    List<Address> getListOfAddresses(int firstRow, int lastRow);

    boolean updateAddress(Address address);

    boolean deleteAddress(Address address);

    List<Address> getListOfAddressesByCityName(String cityName);

    List<Address> getListOfAddressesByStateName(String stateName);

    List<Address> getListOfAddressesByCountryName(String countryName);

    List<Address> getListOfAddressesByStreetName(String streetName);

    List<Address> getListOfAddressesByBuildingNumber(String buildingNumber);

    Address getAddressById(int id);

}
