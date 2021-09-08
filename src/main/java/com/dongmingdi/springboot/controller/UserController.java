package com.dongmingdi.springboot.controller;

import com.dongmingdi.springboot.entity.User;
import com.dongmingdi.springboot.repository.UserRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepostitory userRepostitory;

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") Integer id) {
        Optional<User> user = userRepostitory.findById(id);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        userRepostitory.save(user);
        return user;
    }
}
