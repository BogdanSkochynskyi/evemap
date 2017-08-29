package com.btrco.projects.evemap.repository;

import com.btrco.projects.evemap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByeMail(String eMail);

    User findByLogin(String login);
}
