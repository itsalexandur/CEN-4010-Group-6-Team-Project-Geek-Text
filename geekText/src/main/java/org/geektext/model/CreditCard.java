package org.geektext.model;

import jakarta.persistence.OneToOne;

public class CreditCard {

    private final int cardNumber;
    private final int cvv;
    private final int expDate;

    @OneToOne
    private User user;

    public CreditCard(int cardNumber, int cvv, int expDate, User user) {
        this.user = user;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public int getExpDate() {
        return expDate;
    }

}
