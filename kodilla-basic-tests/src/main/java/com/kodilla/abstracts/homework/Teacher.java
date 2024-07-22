package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher(double salary) {
        super(salary, new String[] {"Preparing lessons", "Teaching students", "Individual support to students", "Communicating with parents"});
    }
}
