package com.pluralsight.structural.bridge.practice.shape2;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
