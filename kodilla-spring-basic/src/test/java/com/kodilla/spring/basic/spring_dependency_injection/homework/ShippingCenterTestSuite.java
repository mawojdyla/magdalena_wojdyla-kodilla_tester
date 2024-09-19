package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCenterTestSuite {

     private com.kodilla.spring.basic.spring_dependency_injection.homework.DeliveryService deliveryService;
     private com.kodilla.spring.basic.spring_dependency_injection.homework.NotificationService notificationService;
     private com.kodilla.spring.basic.spring_dependency_injection.homework.ShippingCenter shippingCenter;

    @BeforeEach
    public void setUp() {
        deliveryService = new DeliveryService();
        notificationService = new NotificationService();
        shippingCenter = new ShippingCenter(deliveryService, notificationService);
    }


    @Test
    public void shouldDeliverPackageIfWeightIsLowerThan30() {

        boolean result = deliveryService.deliverPackage("First address", 10.0);

        assertTrue(result); // paczka dostarczona
    }

    @Test
    public void shouldNotDeliverPackageIfWeightIsMoreThan30() {

        boolean result = deliveryService.deliverPackage("Second address", 31.0);

        assertFalse(result);    // paczka niedostarczona
    }

    @Test
    public void shouldReturnSuccessMessage() {

        String message = notificationService.success("First address");

        assertEquals("Package delivered to: First address", message);
    }

    @Test
    public void shouldReturnFailMessage() {

        String message = notificationService.fail("Second address");    // Wrong address

        assertEquals("Package not delivered to: Second address", message);
    }

    @Test
    public void shouldReturnSuccessWhenPackageIsDelivered() {

        String result = shippingCenter.sendPackage("First address", 10.0);

        assertEquals("Package delivered to: First address", result);
    }

    @Test
    public void shouldReturnFailWhenPackageIsTooHeavy() {

        String result = shippingCenter.sendPackage("Second address", 31.0);

        assertEquals("Package not delivered to: Second address", result);
    }
}
