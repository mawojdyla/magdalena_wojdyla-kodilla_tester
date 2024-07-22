package com.kodilla.abstracts.homework;

public class Pharmacist extends Job {
    public Pharmacist(double salary) {
        super(salary, new String[] {"Dispensing medications", "Advising patients", "Preparing compounded medications", "Monitoring drug interactions"});
    }
}
