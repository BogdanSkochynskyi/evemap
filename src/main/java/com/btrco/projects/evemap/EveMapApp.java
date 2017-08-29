package com.btrco.projects.evemap;

import com.btrco.projects.evemap.model.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EveMapApp {

    public static void main(String[] args) {
        SpringApplication.run(EveMapApp.class, args);
    }
}
