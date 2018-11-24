package com.kelaniya.uni.demobackend.controller;

import com.kelaniya.uni.demobackend.model.User;
import com.kelaniya.uni.demobackend.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    final private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public User getUser(@RequestParam Integer id){
        Optional<User> user = userRepository.findById(id);
        return  user.get();
    }

    @GetMapping("/all")
    public Iterable<User> getAllUser(){
        return userRepository.findAll();
    }

}