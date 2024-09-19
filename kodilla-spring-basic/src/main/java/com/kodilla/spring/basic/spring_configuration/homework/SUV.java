package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0));
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
