package com.pluralsight.structural.bridge.practice.shape1;

public class RedCircle extends Circle{
    @Override
    public void applyColor() {
        System.out.println("Applying red color to the circle");
    }
}
