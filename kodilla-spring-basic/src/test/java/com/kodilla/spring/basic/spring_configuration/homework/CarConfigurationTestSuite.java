package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarConfigurationTestSuite {

    @Autowired
    private Car car;

    
    // SUV
    @Test
    public void shouldReturnTrueForSUVIfHeadlightsTurnedOnAtNight() {
        LocalTime testTime = LocalTime.of(21, 0);
        assertTrue(car.hasHeadlightsTurnedOn(testTime), "Headlights should be turned on after 20:00");
    }

    @Test
    public void shouldReturnFalseForSUVIfHeadlightsTurnedOffDuringTheDay() {
        LocalTime testTime = LocalTime.of(10, 0);
        assertFalse(car.hasHeadlightsTurnedOn(testTime), "Headlights should be turned off during the day");
    }


    // Cabrio
    @Test
    public void shouldReturnTrueForCabrioIfHeadlightsTurnedOnAtNight() {
        LocalTime testTime = LocalTime.of(21, 0);
        assertTrue(car.hasHeadlightsTurnedOn(testTime));
    }

    @Test
    public void shouldReturnFalseForCabrioIfHeadlightsTurnedOffDuringTheDay() {
        LocalTime testTime = LocalTime.of(10, 0);
        assertFalse(car.hasHeadlightsTurnedOn(testTime));
    }



    // Sedan
    @Test
    public void shouldReturnTrueForSedanIfHeadlightsTurnedOnAtNight() {
        LocalTime testTime = LocalTime.of(21, 0);
        assertTrue(car.hasHeadlightsTurnedOn(testTime));
    }

    @Test
    public void shouldReturnFalseForSedanIfHeadlightsTurnedOffDuringTheDay() {
        LocalTime testTime = LocalTime.of(10, 0);
        assertFalse(car.hasHeadlightsTurnedOn(testTime));
    }


    //     Konfiguracja wg. pór roku
    @Test
    public void shouldReturnCorrectCarBasedOnSeason() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfiguration.class);
        Car car = (Car) context.getBean("carSelectionBasedOnSeason");

        String carType = car.getCarType();
        System.out.println("Selected car type: " + carType);

        assertNotNull(car);
    }



    @Test
    public void shouldReturnValidCarType() {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();
        if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
            assertEquals("SUV", car.getCarType());
        } else if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            assertEquals("Cabrio", car.getCarType());
        } else {
            assertEquals("Sedan", car.getCarType());
        }
    }


}
























