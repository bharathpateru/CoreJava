package com.corejava.java8.streamsrealworld.users;

import java.util.List;

public class UserDao {
    public List<User> getUsers(){
        List<User> users = List.of(
               // new User(1, new Profile("email")),
        );

        return users;
    }
}
