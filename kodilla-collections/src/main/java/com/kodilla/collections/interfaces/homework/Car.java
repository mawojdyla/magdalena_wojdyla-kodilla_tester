package com.kodilla.collections.interfaces.homework;

public interface Car {

    int getSpeed();

    void increaseSpeed();

    void decreaseSpeed();

    default String getModel() {
        return getClass().getSimpleName();
    }
}
