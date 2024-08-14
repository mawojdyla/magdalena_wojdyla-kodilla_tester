package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {
    public OrderDoesntExistException(String message) {      // konstruktor
        super(message);                                     // wywołuje konstruktor klasy nadrzędnej 'Exception'
    }

}

/*
extends Exception: Wskazuje, że klasa OrderDoesntExistException dziedziczy z klasy Exception.
 Dzięki dziedziczeniu klasa ta staje się rodzajem wyjątku, co oznacza,
 że może być używana w konstrukcjach try-catch i rzucana za pomocą throw.
 */