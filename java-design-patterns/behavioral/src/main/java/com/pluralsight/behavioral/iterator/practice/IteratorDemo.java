package com.pluralsight.behavioral.iterator.practice;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Honda");
        repo.addBike("Yamaha");
        repo.addBike("TVS");
        repo.addBike("Royal Enfield");
        repo.addBike("Hero");

        Iterator<String> bikeIterator = repo.iterator();

        while(bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
    }
}
