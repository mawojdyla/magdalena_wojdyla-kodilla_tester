package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTestSuite {

    @Test
    void TestFindOrder() throws OrderDoesntExistException {
        // given
        Storage storage = new Storage();
        storage.addOrder(new Order("001"));
        storage.addOrder(new Order("002"));
        storage.addOrder(new Order("003"));
        // when
        Order result = storage.findOrder("001");
        // then
        assertNotNull(result);
    }

    @Test
    void TestFindNotExistingOrder() {
        Storage storage = new Storage();
        assertThrows(OrderDoesntExistException.class, () -> storage.findOrder("000")); // oczekujemy że będzie wyrzucony typ (.class)

    }
}