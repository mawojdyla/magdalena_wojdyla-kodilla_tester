package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;


    //      klasa Triangle ma własne pola (base, hight, sideA, sideB, sideC) do inicjalizacji
    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
