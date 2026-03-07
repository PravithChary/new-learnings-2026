package com.pluralsight.structural.bridge.practice.shape2;

public class Red implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
