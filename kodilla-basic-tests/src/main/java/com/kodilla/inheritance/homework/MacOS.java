package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {
    public MacOS(int yearOfRelease) {
        super(yearOfRelease);
    }

    public void turnOn() {
        System.out.println("Operating system starts...");
    }

    public void turnOff() {
        System.out.println("Operating system shuts down...");
    }
}
