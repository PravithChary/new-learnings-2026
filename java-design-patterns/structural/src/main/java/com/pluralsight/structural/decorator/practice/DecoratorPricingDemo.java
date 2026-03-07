package com.pluralsight.structural.decorator.practice;

public class DecoratorPricingDemo {

    public static void main(String[] args) {
        PriceCalculator price = new TaxDecorator(new BasePrice(100), .107);
        System.out.println(price.calculate());

        PriceCalculator discountedPrice = new DiscountDecorator(new BasePrice(110.7), 0.3);
        System.out.println(discountedPrice.calculate());

        // Let's try discount after taxing :-)
        PriceCalculator finalDiscountedPrice = new DiscountDecorator(new TaxDecorator(new BasePrice(100), .107), 0.3);
        System.out.println(finalDiscountedPrice.calculate());
    }
}
