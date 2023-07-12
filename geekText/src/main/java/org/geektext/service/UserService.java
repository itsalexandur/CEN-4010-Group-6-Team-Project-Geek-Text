package org.geektext.service;


import org.geektext.dao.UserDao;
import org.geektext.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService( UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> selectAllUsers(User user){
        return userDao.selectAllUsers();
    }
    public int addUser(User user){
        return userDao.insertUser( user);
    }

    public User getUserByUsername(String username){
        return userDao.selectUserByUsername(username);
    }
}
