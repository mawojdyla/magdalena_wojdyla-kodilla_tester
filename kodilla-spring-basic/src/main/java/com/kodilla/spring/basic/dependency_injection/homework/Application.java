package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        // Tworzymy implementację interfesjów
        DeliveryService deliveryService = new DeliveryServiceImpl();
        NotificationService notificationService = new NotificationServiceImpl();

        // Wstrzykujemy zależności przez konstruktor
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        // Wysyłamy paczkę
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}


// żeby skorzystać z wstrzykiwania zależności, musimy utworzyć instancje odpowiednich klas
// implementujących interfejsy i przekazać je do ShippingCenter.