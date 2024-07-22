package com.kodilla.inheritance.homework;

public class ApplicationSys {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2023);
        System.out.println("Operating system year of release: " + operatingSystem.getYear());
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows windows = new Windows(2020);
        System.out.println("Windows year of release: " + windows.getYear());
        windows.turnOn();
        windows.turnOff();

        MacOS macOS = new MacOS(2021);
        System.out.println("MacOS year of release: " + macOS.getYear());
        macOS.turnOn();
        macOS.turnOff();
    }
}
