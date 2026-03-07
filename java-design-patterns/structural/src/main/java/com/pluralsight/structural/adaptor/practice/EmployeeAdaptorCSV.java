package com.pluralsight.structural.adaptor.practice;

public class EmployeeAdaptorCSV implements Employee{

    private EmployeeCSV employeeCSV;

    public EmployeeAdaptorCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }

    @Override
    public String toString() {
        return "[ id=" + employeeCSV.getId() + ", " +
               "firstName=" + employeeCSV.getFirstName() + ", " +
               "lastName=" + employeeCSV.getLastName() + ", " +
               "email=" + employeeCSV.getEmailAddress() + "]";
    }
}
