package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {
    private int speed;
    private String model;

    public Ford() {
        this.speed = 0;
        this.model = "Ford";
    }
    public Ford(String model) {
        this.model = model;
        this.speed = 0;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 15;        // speed += 15
    }


    @Override
    public void decreaseSpeed() {
        speed = speed - 19;
//        if (speed < 0) speed = 0;     Sprawdza czy prędkość nie jest ujemna
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
