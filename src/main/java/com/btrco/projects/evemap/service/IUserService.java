package com.btrco.projects.evemap.service;

import com.btrco.projects.evemap.model.User;

import java.util.List;

/**
 * Created by BTRco on 13.08.2017.
 */
public interface IUserService {

    User addUser(User user);

    List<User> getListOfUsers();

    List<User> getListOfUsers(int firstRow, int lastRow);

    boolean updateUser(User user);

    boolean deleteUser(User user);

    User getUserById(int id);

    User getUserByEMail(String eMail);

    User getUserByLogin(String login);

    //TODO: add get list of users by role



}
