package com.kodilla.collections.adv.immutable;

public class Book {
    protected String author;
    protected String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}

/*
protected - pola prywatne z dostępem dla klas dziedziczących z klasy Book oraz inne klasyw obrębie
tego samego pakietu;
 */