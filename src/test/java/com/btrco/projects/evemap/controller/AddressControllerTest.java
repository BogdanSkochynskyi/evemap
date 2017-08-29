package com.btrco.projects.evemap.controller;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.service.implementation.AddressService;
import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AddressControllerTest {

    @Mock
    private AddressService addressService;

    @InjectMocks
    AddressController sut;

    @Test
    public void getAllAddresses() throws Exception {
        //preparing
        when(addressService.getListOfAddresses()).thenReturn(ImmutableList.of());
        //testing
        List<Address> list = sut.getAllAddresses();
        //validate
        verify(addressService).getListOfAddresses();

    }

}