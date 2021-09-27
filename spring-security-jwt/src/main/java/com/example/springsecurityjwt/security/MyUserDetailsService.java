package com.example.springsecurityjwt.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // tải thông tin người dùng
//        UserInfo userInfo = userInfoDAO.findUserInfoByUsername(username);
//        if (userInfo == null)
//            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        Set<SimpleGrantedAuthority> simpleGrantedAuthorities = new HashSet<>();
        return new User("admin","admin", simpleGrantedAuthorities);
    }
}
