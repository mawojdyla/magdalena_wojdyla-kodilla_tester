package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
     private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        orders.add(order);
    }


    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException("Zamówienie o numerze: " + number + " nie istnieje"));
    }
}

/*
.findFirst()
Znajduje pierwszy element w strumieniu, który spełnia warunek filtra.
Zwraca Optional<Order>, który może zawierać znalezione zamówienie lub być pusty,
jeśli żadne zamówienie nie spełnia warunku.
 */