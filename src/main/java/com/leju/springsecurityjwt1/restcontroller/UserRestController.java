package com.leju.springsecurityjwt1.restcontroller;

import com.leju.springsecurityjwt1.model.User;
import com.leju.springsecurityjwt1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<User> all() {
        return userService.findAll();
    }
}
