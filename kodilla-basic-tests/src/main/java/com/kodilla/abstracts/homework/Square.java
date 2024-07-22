package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    } // klasa Square ma własne pole (side) do inicjalizacji

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
