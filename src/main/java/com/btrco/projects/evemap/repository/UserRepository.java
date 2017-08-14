package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
