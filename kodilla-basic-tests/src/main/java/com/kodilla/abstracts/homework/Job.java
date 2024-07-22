package com.kodilla.abstracts.homework;

public abstract class Job {         // jest bazą dla innych konkretnych zawodów
    private double salary;
    private String[] responsibilities;

    public Job(double salary, String[] responsibilities) {      // konstruktor
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public double getSalary() {
        return salary;
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void displayResponsibilities() {     // metoda abstrakcyjna do zaimplementowania w klasach dziedziczących
        System.out.println("Responsibilities:");
        for (String responsibility : responsibilities) {
            System.out.println("- " + responsibility);
        }
    }
}
