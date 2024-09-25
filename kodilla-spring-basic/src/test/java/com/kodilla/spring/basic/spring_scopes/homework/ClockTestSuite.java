package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ClockTestSuite {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldDisplayDifferentTime() throws InterruptedException {
        Clock clock1 = context.getBean(Clock.class); // ręczne pobranie nowej instancji beana
        Thread.sleep(10);   // opóźnienie na 10 ms.
        Clock clock2 = context.getBean(Clock.class);    // czas w każdej tej instancji będzie inny
        Thread.sleep(10);
        Clock clock3 = context.getBean(Clock.class);

        assertNotEquals(clock1.getCurrentTime(), clock2.getCurrentTime());
        assertNotEquals(clock2.getCurrentTime(), clock3.getCurrentTime());
        assertNotEquals(clock1.getCurrentTime(), clock3.getCurrentTime());
    }
}



/*  jeśli wszystkie instancje są tworzone niemal jednocześnie,
mogą mieć bardzo podobny czas (nawet do nanosekundy),
co powoduje, że testy mogą zawieść

@SpringBootTest
public class ClockTestSuite {

    @Autowired
    private Clock clock1;

    @Autowired
    private Clock clock2;

    @Autowired
    private Clock clock3;

    @Test
    public void shouldDisplayDifferentTime() {
        assertNotEquals(clock1.getCurrentTime(), clock2.getCurrentTime());
        assertNotEquals(clock2.getCurrentTime(), clock3.getCurrentTime());
        assertNotEquals(clock1.getCurrentTime(), clock3.getCurrentTime());
    }
}
 */