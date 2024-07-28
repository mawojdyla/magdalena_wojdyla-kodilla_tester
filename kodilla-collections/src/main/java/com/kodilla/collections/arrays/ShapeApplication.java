package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();                   // liczba figur losowana jest z zakresu poniżej, tj.
        Shape[] shapes = new Shape[random.nextInt(20) + 1]; // od 1 do 20. Jeśli chcemy 5 figur to: " Shape[] shapes = new Shape[5];"
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        int drawnShapeKind = RANDOM.nextInt(3);
        double a = getRandomSize();
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize();
            double c = getRandomSize();
            return new Triangle(a, b, c);
        }
    }

    private static double getRandomSize() {
        return RANDOM.nextDouble() * 100 + 1;       // possible values: 1.000-100.999...
    }

}

/*
static RANDOM - możemy używać jednego generatora losowego w całej klasie,
'RANDOM' zawsze będzie wskazywać na ten sam obiekt "Random"
'RANDOM' zapisane wielkimim literami wskazuje na stałą w Javie
 */