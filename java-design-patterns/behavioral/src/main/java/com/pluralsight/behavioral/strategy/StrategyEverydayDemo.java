package com.pluralsight.behavioral.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
    private static void printContents(List<Person> people) {
        for(Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {
        Person pravith = new Person("Pravith", "99999", 21);
        Person rohith = new Person("Rohith", "77777", 20);
        Person ranjith = new Person("Ranjith", "88888", 22);

        List<Person> people = new ArrayList<Person>();
        people.add(pravith);
        people.add(ranjith);
        people.add(rohith);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
           @Override
           public int compare(Person p1, Person p2) {
               return p1.getAge() == p2.getAge() ? 0 : p1.getAge() > p2.getAge() ? 1 : -1;
           }
        });

        System.out.println("\nSorted by age");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("\nSorted by name");
        printContents(people);
    }
}
