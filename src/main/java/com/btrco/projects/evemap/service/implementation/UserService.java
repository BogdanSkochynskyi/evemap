package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.Address;
import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.repository.UserRepository;
import com.btrco.projects.evemap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getListOfUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users :: add);
        return users;
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findOne(id);
    }

//    @Override
//    public User getUserByEMail(String eMail) {
//        return userRepository.findByEMail(eMail);
//    }
//
//    @Override
//    public User getUserByLogin(String login) {
//        return userRepository.findByLogin(login);
//    }
}
