package com.pluralsight.structural.adaptor;

import java.util.*;

public class AdaptorEverydayDemo {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts); // asList() -> adapter pattern
        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
