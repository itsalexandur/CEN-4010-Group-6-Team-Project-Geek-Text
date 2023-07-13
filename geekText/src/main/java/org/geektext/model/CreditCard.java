package org.geektext.model;

public class CreditCard {

    private final int cardNumber;
    private final String name;
    private final int cvv;
    private final int expDate;

    public CreditCard(int cardNumber, String name, int cvv, int expDate) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expDate = expDate;
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
