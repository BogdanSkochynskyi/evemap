package com.btrco.projects.evemap.service;

import com.btrco.projects.evemap.model.Address;

import java.util.List;

public interface IAddressService {

    Address addAddress(Address address);

    List<Address> getListOfAddresses();

    Address updateAddress(Address address);

    void deleteAddress(Address address);

//    List<Address> getListOfAddressesByCityName(String cityName);
//
//    List<Address> getListOfAddressesByStateName(String stateName);
//
//    List<Address> getListOfAddressesByCountryName(String countryName);
//
//    List<Address> getListOfAddressesByStreetName(String streetName);
//
//    List<Address> getListOfAddressesByBuildingNumber(String buildingNumber);

    Address getAddressById(long id);

}
