package com.pluralsight.structural.decorator.practice;

public class DiscountDecorator extends PriceDecorator{

    private double discountRate;

    public DiscountDecorator(PriceCalculator wrappedCalculator, double discountRate) {
        super(wrappedCalculator);
        this.discountRate = discountRate;
    }

    @Override
    public double calculate() {
        double basePrice = super.calculate();
        return basePrice * (1 - discountRate);
    }
}
