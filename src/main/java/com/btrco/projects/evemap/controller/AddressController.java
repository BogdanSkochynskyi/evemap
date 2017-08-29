package com.btrco.projects.evemap.controller;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.repository.AddressRepository;
import com.btrco.projects.evemap.service.implementation.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/addresses")
    public List<Address> getAllAddresses(){
        return addressService.getListOfAddresses();
    }
}
