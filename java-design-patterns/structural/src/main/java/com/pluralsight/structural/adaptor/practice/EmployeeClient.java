package com.pluralsight.structural.adaptor.practice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeDB = new EmployeeDB("1234", "Pravith", "Chary", "pravith@learning.com");
        employees.add(employeeDB);

        // Adaptor pattern is used below
        Employee employeeAdaptorLdap = new EmployeeAdaptorLdap(new EmployeeLdap("23", "Reddy", "Ranjith", "ranjith@gmail.com"));
        employees.add(employeeAdaptorLdap);

        Employee employeeAdapterCSV = new EmployeeAdaptorCSV(new EmployeeCSV("12, Naidu, Rohith, rohith@yahoo.com"));
        employees.add(employeeAdapterCSV);

        return employees;
    }
}
