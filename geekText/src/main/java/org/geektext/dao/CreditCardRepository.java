package org.geektext.dao;


import org.geektext.model.CreditCard;
import org.geektext.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CreditCardRepository implements CreditCardDao{

    @Autowired
    public CreditCardRepository(){}

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertCard(CreditCard card) {
        jdbcTemplate.update("INSERT INTO creditcard(cardNumber, cvv, expDate) VALUES(?,?,?)",
                card.getCardNumber(), card.getCvv(), card.getExpDate());

    }

    @Override
    public void insertCard(CreditCard card, User user) {
        jdbcTemplate.update("INSERT INTO creditcard(fullname, username)VALUES(?,?)",
                user.getFullname(), user.getUsername());
    }



}
