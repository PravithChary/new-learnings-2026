package com.pluralsight.behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();

        emp.setName("Rohith Naidu");
        emp.setAddress("Keshav Nagar Pune");
        emp.setPhone("999-999-9999");

        System.out.println("Employee before save:                  " + emp);
        caretaker.save(emp);

        emp.setPhone("888-888-8888");
        caretaker.save(emp);
        System.out.println("Employee after changed phone num save: " + emp);

        emp.setPhone("777-777-7777"); // <----- we haven't called save!
        caretaker.revert(emp);
        System.out.println("Reverts to last save point:            " + emp);

        caretaker.revert(emp);
        System.out.println("Reverted to original:                  " + emp);
    }
}
