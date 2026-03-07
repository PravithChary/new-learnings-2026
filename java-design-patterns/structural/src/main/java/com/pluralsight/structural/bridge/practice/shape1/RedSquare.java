package com.pluralsight.structural.bridge.practice.shape1;

public class RedSquare extends Square{
    @Override
    public void applyColor() {
        System.out.println("Applying red color to the square");
    }
}
