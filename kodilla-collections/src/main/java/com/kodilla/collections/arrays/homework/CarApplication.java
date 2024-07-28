package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static Car drawCar() {
        // Losowanie marki samochodu
        int carBrand = RANDOM.nextInt(3); // 0-2
        Car car;        // Deklaracja zmiennej car
        if (carBrand == 0) {
            car = new Ford();
        } else if (carBrand == 1) {
            car = new Opel();
        } else {
            car = new Toyota();
        }

        for (int i = 0; i < RANDOM.nextInt(5) + 1; i++) {
            car.increaseSpeed();
        }
        return car;
    }


    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}