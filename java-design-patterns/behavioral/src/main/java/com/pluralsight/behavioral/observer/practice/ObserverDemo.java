package com.pluralsight.behavioral.observer.practice;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a message!");
        tabletClient.addMessage("Another new message!");
    }
}
