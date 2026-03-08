package com.pluralsight.behavioral.state;

public class Fan {
    static final int OFF = 0;
    static final int LOW = 1;

    int state = OFF;

    public Fan() {

    }

    public void pullChain() {
        if(state == OFF) {
            System.out.println("Turning fan on low.");
            state = LOW;
        } else if(state == LOW) {
            System.out.println("Turning fan off");
            state = OFF;
        }
    }

    public String toString() {
        return state == OFF ? "Fan is off." : "Fan is on low";
    }
}
