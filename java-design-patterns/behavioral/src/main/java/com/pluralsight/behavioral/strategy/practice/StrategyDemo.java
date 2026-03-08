package com.pluralsight.behavioral.strategy.practice;

public class StrategyDemo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex Valid: " + amexCard.isValid());

        CreditCard amexCard2 = new CreditCard(new AmexStrategy());
        amexCard2.setNumber("379185883464282");
        amexCard2.setDate("04/2017");
        amexCard2.setCvv("234");

        System.out.println("Is Amex Valid: " + amexCard2.isValid());

        CreditCard visaCard = new CreditCard(new VisaStrategy());
        visaCard.setNumber("4532344823048920");
        visaCard.setDate("04/2028");
        visaCard.setCvv("432");

        System.out.println("Is Visa Valid: " + visaCard.isValid());
    }
}
