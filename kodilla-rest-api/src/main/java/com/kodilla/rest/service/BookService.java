package com.kodilla.rest.service;

import com.kodilla.rest.controller.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(BookDto bookDto) {
        books.add(bookDto);
    }

    public void removeBook(BookDto bookDto) {
        books.remove(bookDto);
    }
}

/*
Adnotacja @Service nad klasą informuje Springa o tym,
że ta klasa jest beanem i jej obiekt ma zostać utworzone w kontenerze Springa.
 */