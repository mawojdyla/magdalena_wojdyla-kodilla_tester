package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository { // przechowuje informacje o dostępnych lotach
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("London", "New York"));
        flights.add(new Flight("London", "Cracow"));
        flights.add(new Flight("New York", "Cracow"));
        flights.add(new Flight("Paris", "Amsterdam"));
        flights.add(new Flight("Milan", "Warsaw"));
        flights.add(new Flight("Helsinki", "Dublin"));

        return flights;
    }

}

/* zmodyfikowana klasa FlightRepository na potrzeby testu dla pustej listy lotów
(testFindFlightsFrom/To_withEmptyFlightsTable())
-------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flightsTable = new ArrayList<>();

    // Metoda, która zwraca loty
    public static List<Flight> getFlightsTable() {
        return flightsTable;
    }

    public static void setFlightsTable(List<Flight> flights) {
        flightsTable = flights;
    }
}
 */

