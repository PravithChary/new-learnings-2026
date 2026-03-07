package com.pluralsight.structural.bridge.practice.shape1;

public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color to circle");
    }
}
