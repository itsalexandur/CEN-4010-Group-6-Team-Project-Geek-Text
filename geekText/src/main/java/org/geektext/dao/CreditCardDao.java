package org.geektext.dao;

import org.geektext.model.CreditCard;
import org.geektext.model.User;

public interface CreditCardDao {

    void insertCard(CreditCard card);

    void insertCard(CreditCard card, int userId);
}
