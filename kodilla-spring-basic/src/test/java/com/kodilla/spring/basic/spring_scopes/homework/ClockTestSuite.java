package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
