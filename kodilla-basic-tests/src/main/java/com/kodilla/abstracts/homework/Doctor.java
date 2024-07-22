package com.kodilla.abstracts.homework;

public class Doctor extends Job {
    public Doctor(double salary) {
        super(salary, new String[]{"Diagnosing patients", "Prescribing medications", "Performing medical procedures", "Monitoring treatment progress"});
    }
}
