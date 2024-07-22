package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int yearOfRelease) {
        super(yearOfRelease);
    }

    public void turnOn() {
        System.out.println("Operating system turn on...");
    }

    public void turnOff() {
        System.out.println("Operating system turn off...");
    }
}
