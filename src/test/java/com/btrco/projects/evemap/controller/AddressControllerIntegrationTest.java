package com.btrco.projects.evemap.controller;

import com.btrco.projects.evemap.EveMapApp;
import com.btrco.projects.evemap.model.Address;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EveMapApp.class/*, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT*/)
public class AddressControllerIntegrationTest {

    TestRestTemplate template = new TestRestTemplate();

    @Test
    public void getAllAddresses() throws Exception {
        ResponseEntity<List<Address>> responseEntity =
                template.exchange("http://localhost:8084/addresses", HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Address>>() {
                        });
        List<Address> actualList = responseEntity.getBody();
        //validate
        assertThat(actualList.size(), is(0));
        List<Long> actualIds = actualList.stream()
                .map(address -> address.getId())
                .collect(collectingAndThen(toList(), ImmutableList::copyOf)); // toList = muttable List
        assertThat(actualIds, containsInAnyOrder("","")); //some relevant ids
    }

}