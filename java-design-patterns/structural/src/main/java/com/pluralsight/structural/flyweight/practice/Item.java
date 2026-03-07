package com.pluralsight.structural.flyweight.practice;

// instances of Item will be the Flyweights
// intrinsic - immutable
class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
