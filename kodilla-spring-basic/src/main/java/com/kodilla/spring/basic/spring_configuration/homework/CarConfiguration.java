package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CarConfiguration {

    private LocalDate currentDate;

    public CarConfiguration() {
        this.currentDate = LocalDate.now(); // domyślnie korzysta z aktualnej daty
    }

    public CarConfiguration(LocalDate date) {    // konstruktor dla testów
        this.currentDate = date;
    }

    @Bean
    public Car carSelectionBasedOnSeason() {
        Month currentMonth = currentDate.getMonth();

        if (currentMonth == Month.DECEMBER || currentMonth == Month.JANUARY || currentMonth == Month.FEBRUARY) {
            return new SUV();
        } else if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            return new Cabrio();
        } else {
            return new Sedan();
        }
    }
}


/*
public Car carSelectionBasedOnSeason() {
        Month currentMonth = getCurrentMonth();

        if (isWinter(currentMonth)) {
            return new SUV();
        } else if (isSummer(currentMonth)) {
            return new Cabrio();
        } else {
            return new Sedan();
        }
    }

    private Month getCurrentMonth() {
        return LocalDate.now().getMonth();
    }

    private boolean isWinter(Month month) {
        return month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY;
    }

    private boolean isSummer(Month month) {
        return month == Month.JUNE || month == Month.JULY || month == Month.AUGUST;
    }
}
 */