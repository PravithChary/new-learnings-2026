package com.pluralsight.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {
    public static void main(String[] args) {
        TwitterStream msgStream = new TwitterStream();

        Client client1 = new Client("Pravith");
        Client client2 = new Client("Ranjith");

        msgStream.addObserver(client1);
        msgStream.addObserver(client1);

        msgStream.someoneTweeted();
    }
}

// concrete subject
class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

// concrete observer
class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}