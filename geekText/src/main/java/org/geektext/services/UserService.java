package org.geektext.services;


import org.geektext.model.User;
import org.geektext.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepo;

    public void addUsers(){

        User user1 = new User("myUsername", "passwrd1");
        User user2 = new User("DogLover123", "passwrd2");
        User user3 = new User("CarGuy23", "passwrd3");

        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);

    }
}
