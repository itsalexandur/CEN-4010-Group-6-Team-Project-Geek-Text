package org.geektext.dao;

import org.geektext.model.User;

import java.util.UUID;
import java.util.List;

public interface UserDao {

    String insertUser(String id, User user);

    default String insertUser(User user){
        String id = String.valueOf(UUID.randomUUID()) ;
        return insertUser(id, user);
    }

    List<User> selectAllUsers();

     User selectUserById(String id);

    List<User> findById(String id);

    int deleteUserById(String id);

    int updateUserById(String  id);
}
