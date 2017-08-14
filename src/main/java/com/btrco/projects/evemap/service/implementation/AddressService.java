package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.repository.AddressRepository;
import com.btrco.projects.evemap.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
@Service
public class AddressService implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        return addressRepository.saveAndFlush(address);
    }

    @Override
    public List<Address> getListOfAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.saveAndFlush(address);
    }

    @Override
    public void deleteAddress(Address address) {
        addressRepository.delete(address);
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
    public Address getAddressById(long id) {
        return addressRepository.findOne(id);
    }
}
