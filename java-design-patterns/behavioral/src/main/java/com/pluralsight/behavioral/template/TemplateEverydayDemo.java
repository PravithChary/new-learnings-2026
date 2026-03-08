package com.pluralsight.behavioral.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateEverydayDemo {
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

        Collections.sort(people);

        System.out.println("\nSorted by age");
        printContents(people);
    }
}
