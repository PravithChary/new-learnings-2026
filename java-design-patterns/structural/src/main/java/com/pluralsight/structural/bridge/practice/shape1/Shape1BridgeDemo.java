package com.pluralsight.structural.bridge.practice.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new BlueSquare();

        circle.applyColor();
        square.applyColor();

        circle = new RedCircle();
        square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }
}
