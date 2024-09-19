package com.kodilla.spring.basic.dependency_injection.homework;

public interface DeliveryService {
    boolean deliverPackage(String address, double weight);
}

/*
Dzięki interfejsom dla:
 - DeliveryService
 - NotificationService
 można zmieniać implementacje usług bez potrzeby modyfikowania klasy ShippingCenter.
 */

