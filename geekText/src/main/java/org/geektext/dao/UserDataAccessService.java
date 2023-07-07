package org.geektext.dao;

import org.geektext.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("fakeDao")
public class UserDataAccessService implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String insertUser(String id, User user){
                return String.valueOf(jdbcTemplate.update("INSERT INTO user (user_id, username, user_password, full_name, email_address, home_address) VALUES(?,?,?,?,?,?)",
                        new Object[]{user.getId(), user.getUsername(), user.getPassword(), user.getFullName(), user.getEmail(), user.getAddress()}));
    }
    public List<User> selectAllUsers(){
        return (List<User>) jdbcTemplate;
    }

    @Override
    public User selectUserById(String id) {
        try{
            User user = jdbcTemplate.queryForObject("SELECT * FROM user WHERE user_id=?",
            BeanPropertyRowMapper.newInstance(User.class),id);
        } catch(IncorrectResultSizeDataAccessException e) {
            return null;
        }
        return null;
    }



    @Override
    public int deleteUserById(String id) {
        return (jdbcTemplate.update("DELETE FROM user WHERE user_id=?", id));
    }

    @Override
    public int updateUserById(String id) {
        return jdbcTemplate.update("UPDATE from user WHERE user_id=?", id);
    }
}
