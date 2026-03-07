package com.pluralsight.structural.proxy;

public class RealService implements Service{
    @Override
    public void perform() {
        System.out.println("Performing the real service operation.");
    }
}
