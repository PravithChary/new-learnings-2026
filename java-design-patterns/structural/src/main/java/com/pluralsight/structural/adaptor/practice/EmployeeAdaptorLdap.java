package com.pluralsight.structural.adaptor.practice;

public class EmployeeAdaptorLdap implements Employee{

    private EmployeeLdap employeeLdap;

    public EmployeeAdaptorLdap(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    @Override
    public String getId() {
        return employeeLdap.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLdap.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLdap.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLdap.getEmail();
    }

    @Override
    public String toString() {
        return "[ id=" + employeeLdap.getCn() + ", " +
                "firstName=" + employeeLdap.getGivenName() + ", " +
                "lastName=" + employeeLdap.getSurname() + ", " +
                "email=" + employeeLdap.getEmail() + "]";
    }
}
