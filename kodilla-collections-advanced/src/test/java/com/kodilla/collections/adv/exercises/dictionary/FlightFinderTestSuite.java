package com.kodilla.collections.adv.exercises.dictionary;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom_withExistingDeparture() {
        // given
        FlightFinder finder = new FlightFinder();
        // Tworzymy instancję FlightFinder, która jest klasą, którą testujemy.

        // when
        List<Flight> result = finder.findFlightsFrom("London");

        // then
        List<Flight> expectedList = new ArrayList<>();  // Tworzymy oczekiwaną listę lotów, która zawiera jeden lot z Londynu do Nowego Jorku.
        expectedList.add(new Flight("London", "New York"));
        expectedList.add(new Flight("London", "Cracow"));

        assertEquals(expectedList.size(), result.size(), "Rozmiar listy wynikowej nie zgadza się z oczekiwanym");

        assertIterableEquals(expectedList, result, "Zawartość listy jest niepoprawna");
        // sprawdza zawartość listy (zgodność elementów i ich kolejność)
    }

    @Test
    public void testFindFlightsFrom_withNonexistentDeparture() {
        // given
        FlightFinder finder = new FlightFinder();

        //when
        List<Flight> result = finder.findFlightsFrom("Cracow");

        // then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(expectedList, result); // Sprawdzam, czy zwrócona lista jest pusta
    }
    /*
     Pusta lista lotów - działa ze zmodyfikowaną klsaą FlightRepository
    @Test
    public void testFindFlightsFrom_withEmptyFlightsTable() {
        // given
        FlightRepository.setFlightsTable(new ArrayList<>());
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsFrom("London");

        // then
        assertTrue(result.isEmpty(), "Lista lotów powinna być pusta, gdy brak danych");
    }
     */

    @Test
    public void testFindFlightsTo_withExistingArrival() {
        //given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsTo("Amsterdam");

        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Paris", "Amsterdam"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo_withNonexistentArrival() {
        // given
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsTo("London");

        //then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(expectedList, result);
    }
}

    /*
         Pusta lista lotów
    @Test
    public void testFindFlightsTo_withEmptyFlightsTable() {
        // given
        FlightRepository.setFlightsTable(new ArrayList<>());
        FlightFinder finder = new FlightFinder();

        // when
        List<Flight> result = finder.findFlightsTo("Cracow");

        // then
        assertTrue(result.isEmpty(), "Lista lotów powinna być pusta, gdy brak danych");
    }
    -------------------------------------------------------------------
    Sprawdzenie liczby lotów z "London"
    int londonCount = 0;
    for (Flight flight : result) {
    if (flight.getDeparture().equals("London")) {
    londonCount++;
      }
   }
     assertEquals(2, londonCount, "Liczba lotów z Londynu jest niepoprawna");

     ------------------------------------------------------------------
        testFindFlightsFrom_withExistingDeparture:
        Sprawdza, czy metoda findFlightsFrom zwraca poprawną listę lotów z Londynu, gdy loty są dostępne.

        testFindFlightsFrom_withNonexistentDeparture:
        Sprawdza, czy metoda findFlightsFrom zwraca pustą listę, gdy nie ma lotów z podanego miasta.

        testFindFlightsFrom_withEmptyFlightsTable:
        Sprawdza, czy metoda findFlightsFrom zwraca pustą listę, gdy tabela lotów jest pusta.

     */

