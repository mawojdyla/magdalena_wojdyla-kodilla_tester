package com.kodilla.spring.basic.spring_dependency_injection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class SimpleApplicationTestSuite {

    @Test
    public void shouldReturnCorrectMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");    // [1]
        SkypeMessageService bean = context.getBean(SkypeMessageService.class);  // [2]
        String message = bean.send("Test", "Any receiver");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldProcessMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        SimpleApplication bean = context.getBean(SimpleApplication.class);
        String message = bean.processMessage("Test", "Any receiver");
        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
    }

}

/*
[1] pobierany jest kontekst Springowy. Konieczne jest wskazanie nazwy pakietu – pomaga to określić zasięg skanowania.
[2] metoda getBean(Type.class), szuka beana określonego typu. Zauważ, musimy dodać .class – tak przekazujemy oczekiwany typ.

Bean powinien wykonywać określone działania, ale nie powinien zawierać kolekcji danych czy innych wartości.


 */
