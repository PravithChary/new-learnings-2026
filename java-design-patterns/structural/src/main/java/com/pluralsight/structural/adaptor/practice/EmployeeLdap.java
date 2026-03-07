package com.pluralsight.structural.adaptor.practice;

public class EmployeeLdap {

    private String cn;
    private String surname;
    private String givenName;
    private String email;

    public EmployeeLdap(String cn, String surname, String givenName, String email) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.email = email;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeLdap{" +
                "cn='" + cn + '\'' +
                ", surname='" + surname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
