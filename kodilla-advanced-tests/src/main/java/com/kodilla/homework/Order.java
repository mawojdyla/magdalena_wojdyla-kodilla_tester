package com.kodilla.homework;

import java.time.LocalDate;

public class Order {
    private double value;
    private LocalDate date;
    private String user;

    public Order(double value, LocalDate date, String user) {
        this.value = value;
        this.date = date;
        this.user = user;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUser() {
        return user;
    }
}
