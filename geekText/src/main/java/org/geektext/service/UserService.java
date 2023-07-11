package org.geektext.service;


import org.geektext.dao.UserDao;
import org.geektext.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService( UserDao userDao) {
        this.userDao = userDao;
    }

    public String addUser(User user){
        return userDao.insertUser(user);
    }

    public User getUserById(String id){
        return userDao.selectUserById(id);
    }
}
