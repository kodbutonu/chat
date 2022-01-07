package com.kaankubat.chatapp.service;

import java.util.List;
import java.util.Set;

import com.kaankubat.chatapp.entity.User;

public interface UserServiceInterface {

    String save(User user) throws Exception;

    Boolean block(String angry, String blocked);

    Boolean unblock(String angry, String blocked);

    Boolean blockControl(String angry, String blocked);

    List<User> findAll();

    User findByEmail(String mail);

    User findByUserName(String userName);

    Set<String> findAllByName();
}