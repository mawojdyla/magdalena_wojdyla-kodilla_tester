package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfRelease;

    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void turnOn() {
        System.out.println("Turning on...");
    }

    public void turnOff() {
        System.out.println("Turning off...");
    }

    public int getYear() {
        return yearOfRelease;
    }

}


// yearOfRelease - rok wydania