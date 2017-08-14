package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.repository.UserRepository;
import com.btrco.projects.evemap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getListOfUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByEMail(String eMail) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }
}
