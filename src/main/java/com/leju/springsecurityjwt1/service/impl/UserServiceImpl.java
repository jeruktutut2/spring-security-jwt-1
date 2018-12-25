package com.leju.springsecurityjwt1.service.impl;

import com.leju.springsecurityjwt1.model.User;
import com.leju.springsecurityjwt1.repository.UserRepository;
import com.leju.springsecurityjwt1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
