package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {     //  klasa Rectangle ma własne pola (width, length) do inicjalizacji

        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
