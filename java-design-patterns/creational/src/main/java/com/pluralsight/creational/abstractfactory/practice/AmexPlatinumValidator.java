package com.pluralsight.creational.abstractfactory.practice;

public class AmexPlatinumValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
