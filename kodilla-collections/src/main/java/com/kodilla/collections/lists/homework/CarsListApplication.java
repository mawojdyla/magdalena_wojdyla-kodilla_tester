package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford("Focus"));
        cars.add(new Mustang());
        cars.add(new Ford());
        cars.add(new Ford("Fiesta"));
        cars.add(new Opel());
        cars.add(new Toyota());

        cars.remove(2);

        Ford ford = new Ford();
        cars.remove(ford);

        for (Car car : cars)
            CarUtils.describeCar(car);
        System.out.println(cars.size());
    }
}
