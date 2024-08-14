package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("01"));
        warehouse.addOrder(new Order("02"));
        warehouse.addOrder(new Order("03"));
        warehouse.addOrder(new Order("04"));

        try {
            Order order = warehouse.getOrder("00");
            System.out.println("Znaleziono zamówienie: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());
        }
    }
}

