package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order findOrder(String number) throws OrderDoesntExistException {
        for (Order order : orders) {
            if (order.getNumber().equals(number)) {
                return order;
            }
        }
        throw new OrderDoesntExistException("Zamówienie o numerze :" + number + " nie istnieje.");

    }
}
