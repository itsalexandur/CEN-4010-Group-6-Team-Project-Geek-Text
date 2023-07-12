package org.geektext.dao;

import org.geektext.model.User;

import java.util.List;

public interface UserDao {

    void insertUser(User user);

    List<User> selectAllUsers();

    User selectUserByUsername(String username);


    int deleteUserById(int id);

    int updateUser(User user);
}
