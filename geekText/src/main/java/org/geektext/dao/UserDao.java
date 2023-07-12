package org.geektext.dao;

import org.geektext.model.User;

import java.util.List;

public interface UserDao {

    int insertUser(User user);

    List<User> selectAllUsers();

    User selectUserByUsername(String username);

    List<User> findById(int id);

    int deleteUserById(int id);

    int updateUser(User user);
}
