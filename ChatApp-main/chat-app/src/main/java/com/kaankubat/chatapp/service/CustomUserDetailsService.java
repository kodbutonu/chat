package com.kaankubat.chatapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kaankubat.chatapp.components.CustomUserDetails;
import com.kaankubat.chatapp.entity.User;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserServiceInterface userServiceInterface;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userServiceInterface.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomUserDetails(user);
    }

}