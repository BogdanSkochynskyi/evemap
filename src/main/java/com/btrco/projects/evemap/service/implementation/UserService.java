package com.btrco.projects.evemap.service.implementation;

import com.btrco.projects.evemap.model.User;
import com.btrco.projects.evemap.service.IUserService;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public class UserService implements IUserService {
    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public List<User> getListOfUsers() {
        return null;
    }

    @Override
    public List<User> getListOfUsers(int firstRow, int lastRow) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public User getUserById(int id) {
        return null;
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
