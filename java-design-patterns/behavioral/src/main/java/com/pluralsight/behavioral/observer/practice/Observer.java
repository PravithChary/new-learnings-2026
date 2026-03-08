package com.pluralsight.behavioral.observer.practice;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
