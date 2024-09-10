package com.kodilla.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTestSuite {
    static Shop shop = new Shop();
    static Order pizza = new Order(43.5, LocalDate.of(2024, 7, 16), "User1");
    static Order kebab = new Order(35.5, LocalDate.of(2024, 7, 19), "User2");
    static Order spaghetti = new Order(40.9, LocalDate.of(2024, 7, 20), "User3");
    static Order lasagne = new Order(39.8, LocalDate.of(2024, 7, 30), "User4");


    @BeforeAll
    public static void addOrdersToShop() {
        shop.addOrder(pizza);
        shop.addOrder(kebab);
        shop.addOrder(spaghetti);
        shop.addOrder(lasagne);
    }

    @Test
    public void shouldAddOrdersAndCheckSize() {
        int result = shop.getSizeOfOrders();
        assertEquals(4, result);
    }

    @Test
    public void shouldGetListOfOrdersFromRangeOfTwoDates() {

        LocalDate startDate = LocalDate.of(2024, 7, 18);
        LocalDate endDate = LocalDate.of(2024, 7, 24);
        List<Order> selectedOrders = shop.getListOfOrdersFromRangeOfTwoDates(startDate, endDate);
        // then
        assertEquals(2, selectedOrders.size());
        assertTrue(selectedOrders.contains(kebab)); // User2
        assertTrue(selectedOrders.contains(spaghetti)); // User3
//        assertEquals("User1", selectedOrders.get(0).getUser());
//        assertEquals("User2", selectedOrders.get(1).getUser());   Expected: User1, Actual: User2
//        assertEquals(pizza, selectedOrders.get(0)); //41, 44, 45    błedy dot kolejności
//        assertEquals(43.5, selectedOrders.get(0).getValue(), 0.01);
//        assertEquals(LocalDate.of(2024, 7, 18), selectedOrders.get(0).getDate());
    }

    @Test
    public void shouldReturnEmptyListIfFetchingOrdersOutOfRange() {
        LocalDate startDate = LocalDate.of(2000, 1, 1);
        LocalDate endDate = LocalDate.of(2015, 1, 1);
        List<Order> selectedOrders = shop.getListOfOrdersFromRangeOfTwoDates(startDate, endDate);

        assertEquals(0, selectedOrders.size());
    }

    @Test
    public void shouldReturnOrderIfRequestedDateIsInOrderDate() {
        LocalDate startDate = LocalDate.of(2024, 7, 16);
        LocalDate endDate = LocalDate.of(2024, 7, 16);
        List<Order> selectedOrders = shop.getListOfOrdersFromRangeOfTwoDates(startDate, endDate);

        assertEquals(1, selectedOrders.size());
    }

    @Test
    public void shouldSumOrders() {
        double result = shop.getSumOfAllOrders();

        assertEquals(159.7, result, 0.01);
    }

    @Test
    public void getListOfOrdersFromIndicatedRange() {
        double minValue = 35.3;
        double maxValue = 45;
        List<Order> result = shop.getListOfOrdersFromIndicatedRange(minValue, maxValue);

        assertEquals(4, result.size());
        assertEquals(35.5, result.get(1).getValue());
    }
}

