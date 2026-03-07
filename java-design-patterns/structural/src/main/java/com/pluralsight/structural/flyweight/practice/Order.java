package com.pluralsight.structural.flyweight.practice;

// extrinsic - can be changed (unique for every instance)
public class Order {
    private final int orderNum;
    private final Item item;

    Order(int orderNum, Item item) {
        this.orderNum = orderNum;
        this.item = item;
    }

    void processOrder() {
        System.out.println("Ordering " + item + " for order number " + orderNum);
    }
}
