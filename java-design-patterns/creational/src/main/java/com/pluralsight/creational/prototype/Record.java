package com.pluralsight.creational.prototype;

public class Record implements Cloneable{
    public Record clone() {
        try {
            return (Record) super.clone(); // calling the parent clone method
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
