package org.geektext.model;

public class CreditCard {



    private final String username;
    private final int cardNumber;
    private final String name;
    private final int cvv;
    private final int expDate;

    public CreditCard(String username, int cardNumber, String name, int cvv, int expDate) {
        this.username = username;
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expDate = expDate;
    }
    public String getUsername() {
        return username;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getName() {
        return name;
    }

    public int getCvv() {
        return cvv;
    }

    public int getExpDate() {
        return expDate;
    }
}
