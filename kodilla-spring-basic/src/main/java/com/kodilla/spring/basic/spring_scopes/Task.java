package com.kodilla.spring.basic.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // za każdym razem tworzony jest nowy obiekt
public class Task {

    public Task() {
        System.out.println("Creating new task bean...");
    }
}
