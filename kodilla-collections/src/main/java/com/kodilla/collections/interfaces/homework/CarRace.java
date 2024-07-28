package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford();
        Car opel = new Opel();
        Car toyota = new Toyota();

        doRace(ford);
        doRace(opel);
        doRace(toyota);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        String carName = car.getClass().getSimpleName();
        System.out.println("Final speed of " + carName + ": " + car.getSpeed());
    }
}
