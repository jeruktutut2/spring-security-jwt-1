package com.leju.springsecurityjwt1.service;

import com.leju.springsecurityjwt1.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
