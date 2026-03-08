package com.pluralsight.behavioral.observer.practice;

public class TabletClient extends Observer {
    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet.");
    }

    @Override
    void update() {
        System.out.println("Tablet stream: " + subject.getState());
    }
}
