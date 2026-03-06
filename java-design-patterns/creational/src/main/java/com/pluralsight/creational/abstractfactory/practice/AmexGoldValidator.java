package com.pluralsight.creational.abstractfactory.practice;

public class AmexGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
