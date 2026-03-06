package com.pluralsight.creational.builder;

public class ComputerTelescopingConfigurerDemo {
    public static void main(String[] args) {
        ComputerTelescoping computer = new ComputerTelescoping(HDD.UPGRADED, RAM.MAX, true, false);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
