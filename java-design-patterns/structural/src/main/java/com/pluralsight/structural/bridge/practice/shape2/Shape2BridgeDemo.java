package com.pluralsight.structural.bridge.practice.shape2;

public class Shape2BridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape blueCircle = new Circle(blue);
        Shape blueSquare = new Square(blue);

        Shape redCircle = new Circle(red);
        Shape redSquare = new Square(red);

        Shape greenCircle = new Circle(green);
        Shape greenSquare = new Square(green);

        blueCircle.applyColor();
        blueSquare.applyColor();
        redCircle.applyColor();
        redSquare.applyColor();
        greenCircle.applyColor();
        greenSquare.applyColor();
    }
}
