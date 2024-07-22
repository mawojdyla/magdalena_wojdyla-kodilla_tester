package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 6);      // tworzy instancję 'Rectangle'
        Shape triangle = new Triangle(2, 4, 5, 6, 7);  //  tworzy instancję 'Triangle'
        Shape square = new Square(4);                                          // tworzy instancję 'Square'

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}
