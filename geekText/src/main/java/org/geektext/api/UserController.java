package org.geektext.api;

import java.util.ArrayList;
import java.util.List;

import org.geektext.dao.UserDao;
import org.geektext.model.User;
import org.geektext.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class UserController {

    @Autowired
    UserDao userRepository;

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<String> addUser(@RequestBody User user){
        try {
            userService.addUser(user);
            return new ResponseEntity<>("User was created successfully", HttpStatus.CREATED);
        } catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String user_id) {
        try{

            List<User> users = new ArrayList<>();

            if (user_id != null) {
                users.addAll(userRepository.findById(user_id));
                return new ResponseEntity<>(HttpStatus.OK);
            }

            users.addAll(userRepository.selectAllUsers());

            if (users.isEmpty()) return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(users, HttpStatus.OK);

        }catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "{id}")
   public User getUserById(@PathVariable("id") String id){
        return userService.getUserById(id);
    }
    }
