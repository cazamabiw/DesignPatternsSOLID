package com.designpattern.controller;

import com.designpattern.user.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class UserManager {

    private static UserManager instance;
    private List<User> users;

    private UserManager() {
        users = new ArrayList<>();
    }

    public static UserManager Instance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(User task) {
        users.add(task);
    }

    public void removeUser(User task) {
        users.remove(task);
    }

    public List<User> getUsers() {
        return users;
    }
}
