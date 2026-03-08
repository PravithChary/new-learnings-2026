package com.pluralsight.behavioral.state;

public class Fan {
    static final int OFF = 0;
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;

    int state = OFF;

    public Fan() {

    }

    public void pullChain() {
        if(state == OFF) {
            System.out.println("Turning fan on low.");
            state = LOW;
        } else if(state == LOW) {
            System.out.println("Turning fan on medium.");
            state = MEDIUM;
        } else if(state == MEDIUM) {
            System.out.println("Turning fan on high.");
            state = HIGH;
        } else if(state == HIGH) {
            System.out.println("Turning fan off.");
            state = OFF;
        }
    }

    public String toString() {
        return switch(state) {
            case OFF -> "Fan is off";
            case LOW -> "Fan is on low";
            case MEDIUM -> "Fan is on medium";
            case HIGH -> "Fan is on high";
            default -> "Wrong state";
        };
    }
}
