package com.pluralsight.behavioral.command.practice;

// receiver and knows nothing about commands
public class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println("Light is turned on.");
    }

    public void off() {
        System.out.println("Light is turned off.");
    }
}
