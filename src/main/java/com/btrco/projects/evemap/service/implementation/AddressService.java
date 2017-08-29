package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.repository.AddressRepository;
import com.btrco.projects.evemap.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getListOfAddresses() {
        List<Address> addresses = new ArrayList<>();
        addressRepository.findAll().forEach(addresses :: add);
        return addresses;
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Address address) {
        addressRepository.delete(address);
    }

//    @Override
//    public List<Address> getListOfAddressesByCityName(String cityName) {
//        return addressRepository.findByCityName(cityName);
//    }
//
//    @Override
//    public List<Address> getListOfAddressesByStateName(String stateName) {
//        return addressRepository.findByStateName(stateName);
//    }
//
//    @Override
//    public List<Address> getListOfAddressesByCountryName(String countryName) {
//        return addressRepository.findByCountryName(countryName);
//    }
//
//    @Override
//    public List<Address> getListOfAddressesByStreetName(String streetName) {
//        return addressRepository.findByStreetName(streetName);
//    }
//
//    @Override
//    public List<Address> getListOfAddressesByBuildingNumber(String buildingNumber) {
//        return addressRepository.findByBuildingNumber(buildingNumber);
//    }

    @Override
    public Address getAddressById(long id) {
        return addressRepository.findOne(id);
    }
}
