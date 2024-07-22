package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        System.out.println(firstName + "'s job responsibilities:");     // jak to jest, że imię zgadza się z job??
        job.displayResponsibilities();
    }

    public static void main(String[] args) {
        Person journalist = new Person("Anna", 30, new Journalist(5000));
        Person doctor = new Person("Alicja", 37, new Doctor(15000));
        Person pharmacist = new Person("Adam", 40, new Pharmacist(5100));
        Person teacher = new Person("Antoni", 29, new Teacher(4500));
        Person developer = new Person("Andrzej", 35, new Developer(20000));

        journalist.displayResponsibilities();
        doctor.displayResponsibilities();
        pharmacist.displayResponsibilities();
        teacher.displayResponsibilities();
        developer.displayResponsibilities();
    }
}
