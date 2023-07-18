package org.geektext.dao;


import org.geektext.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CreditCardRepository implements CreditCardDao{

    public CreditCardRepository(){}

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertCard(CreditCard card, User user){
        jdbcTemplate.update("INSERT INTO creditcard(username, cardNumber, fullname, cvv, expDate) VALUES(?,?,?,?,?)",
                card.getUsername(), card.getCardNumber(), (), card.getCvv(), card.getExpDate());
    }


}
