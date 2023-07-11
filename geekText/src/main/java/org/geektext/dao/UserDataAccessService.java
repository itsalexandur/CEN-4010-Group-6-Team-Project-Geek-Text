package org.geektext.dao;

import org.geektext.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDataAccessService implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public String insertUser(String id, User user){
                return String.valueOf(jdbcTemplate.update("INSERT INTO user (user_id, username, password, name) VALUES (?,?,?,?)",
                        user.getId(), user.getUsername(), user.getPassword(), user.getName()));
    }
    public List<User> selectAllUsers(){

        return jdbcTemplate.query("SELECT * FROM user",(rs, rosNum) ->
                new User(rs.getString("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"))
        );
    }

    @Override
    public User selectUserById(String id) {
        try{
            return jdbcTemplate.queryForObject("SELECT * FROM user WHERE user_id = ?",
            BeanPropertyRowMapper.newInstance(User.class), id);
        } catch(IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> findById(String id) {
        String s = "SELECT * FROM user WHERE user_id LIKE '%" + id + "%'";

        return jdbcTemplate.query(s, BeanPropertyRowMapper.newInstance(User.class));
    }


    @Override
    public int deleteUserById(String id) {
        return (jdbcTemplate.update("DELETE FROM user WHERE user_id=?", id));
    }

    @Override
    public int updateUserById(String id) {
        return jdbcTemplate.update("UPDATE FROM user WHERE user_id=?", id);
    }
}
