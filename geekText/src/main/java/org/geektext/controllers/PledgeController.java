package org.geektext.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PledgeController {
    // code to handle different endpoints


    @GetMapping("/")
    public String homeMessage() {

        return "Testing - '/loadUsers' , '/loadBooks', '/showUsers', '/showBooks'";
    }


}
