package com.pluralsight.creational.abstractfactory.practice;

// Abstract Product
public abstract class CreditCard {
    protected int cardNumLen;
    protected int cscNum;

    public int getCardNumLen() {
        return cardNumLen;
    }

    public void setCardNumLen(int cardNumLen) {
        this.cardNumLen = cardNumLen;
    }

    public int getCscNum() {
        return cscNum;
    }

    public void setCscNum(int cscNum) {
        this.cscNum = cscNum;
    }
}
