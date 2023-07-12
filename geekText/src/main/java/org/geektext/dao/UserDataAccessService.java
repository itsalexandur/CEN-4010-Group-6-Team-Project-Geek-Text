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


    public int insertUser(User user){
                return (jdbcTemplate.update("INSERT INTO user (user_id, username, password, name) VALUES (?,?,?,?)",
                        user.getId(), user.getUsername(), user.getPassword(), user.getName()));
    }
    public List<User> selectAllUsers(){

        return jdbcTemplate.query("SELECT * FROM user",(rs, rosNum) ->
                new User(rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name")));
    }

    @Override
    public User selectUserByUsername(String username) {
        try{
            String str = "SELECT * FROM user WHERE username = ?";
            return jdbcTemplate.queryForObject(str, new Object[]{username},(rs, rosNum) ->
                    new User(rs.getInt("user_id"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("name")));
        } catch(IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<User> findById(int id) {
        String s = "SELECT * FROM user WHERE user_id LIKE '%" + id + "%'";

        return jdbcTemplate.query(s, BeanPropertyRowMapper.newInstance(User.class));
    }


    @Override
    public int deleteUserById(int id) {
        return jdbcTemplate.update("DELETE FROM user WHERE user_id=?", id);
    }

    @Override
    public int updateUser(User user) {
        return jdbcTemplate.update("UPDATE user SET user_id=?, password=?, name=? WHERE username=?",
                user.getId(), user.getPassword(), user.getName(), user.getUsername());
    }
}
