package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    void TestOrderDoesntExistException() throws OrderDoesntExistException {
        // given
       Warehouse warehouse = new Warehouse();

       warehouse.addOrder(new Order("01"));
       warehouse.addOrder(new Order("02"));
       warehouse.addOrder(new Order("03"));
       warehouse.addOrder(new Order("04"));
       // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("00"));
    }
}