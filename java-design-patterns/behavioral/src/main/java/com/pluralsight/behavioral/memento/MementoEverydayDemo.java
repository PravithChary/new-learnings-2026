package com.pluralsight.behavioral.memento;

import java.io.*;

public class MementoEverydayDemo {
    private static Employee deserialize() {
        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return emp;
    }

    private static void serialize(Employee emp) {
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rohith Naidu");
        emp.setAddress("111 Godrej Infinity KeshavNagar Pune");
        emp.setPhone("984-234-7265");

        serialize(emp);

        Employee newEmp = deserialize();
        System.out.println(newEmp.getName());
    }
}
