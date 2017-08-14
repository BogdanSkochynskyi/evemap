package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by BTRco on 14.08.2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM user u WHERE u.eMail = :eMail")
    User findOneByEMail(@Param("eMail") String eMail);

    @Query("SELECT u FROM user u WHERE u.login = :login")
    User findOneByLogin(@Param("login") String login);
}
