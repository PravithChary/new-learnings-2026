package com.pluralsight.structural.decorator.practice;

public class TaxDecorator  extends PriceDecorator{

    private double taxRate;

    public TaxDecorator(PriceCalculator wrappedCalculator, double taxRate) {
        super(wrappedCalculator);
        this.taxRate = taxRate;
    }

    @Override
    public double calculate() {
        double basePrice = super.calculate();
        return basePrice * (1 + taxRate);
    }
}
