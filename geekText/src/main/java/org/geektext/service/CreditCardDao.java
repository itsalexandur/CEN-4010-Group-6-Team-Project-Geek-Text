package org.geektext.service;

import org.geektext.model.CreditCard;

public interface CreditCardDao {

    void insertCard(CreditCard card);

    void insertCard(CreditCard card, int userId);
}
