package com.pluralsight.structural.decorator.practice;

public class BasePrice implements PriceCalculator{

    private double price;

    public BasePrice(double price) {
        this.price = price;
    }

    @Override
    public double calculate() {
        return price;
    }
}
