package com.pluralsight.behavioral.state;

public abstract class State {
    public void handleRequest() {
        System.out.println("Request shouldn't reach here.");
    }
}
