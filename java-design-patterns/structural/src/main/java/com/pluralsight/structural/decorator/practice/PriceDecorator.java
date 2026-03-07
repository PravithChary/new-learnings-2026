package com.pluralsight.structural.decorator.practice;

// Both inheritance and composition
public class PriceDecorator implements PriceCalculator{ // is-a

    protected PriceCalculator wrappedCalculator; // has-a

    public PriceDecorator(PriceCalculator wrappedCalculator) {
        this.wrappedCalculator = wrappedCalculator;
    }

    @Override
    public double calculate() {
        return wrappedCalculator.calculate();
    }
}
