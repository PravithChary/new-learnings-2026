package com.pluralsight.structural.adaptor.practice;

import java.util.List;

public class AdaptorDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
    }
}
