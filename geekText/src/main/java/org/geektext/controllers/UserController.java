package org.geektext.controllers;


import org.geektext.model.User;
import org.geektext.repository.UserRepository;
import org.geektext.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping("/showUsers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Autowired
    UserService userServiceTest;

    @GetMapping("/loadUsers")
    public String loadUsers(){
        userServiceTest.addUsers();
        return "Users Loaded (Testing)";
    }





}
