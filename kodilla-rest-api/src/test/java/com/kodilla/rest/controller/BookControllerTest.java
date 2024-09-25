package com.kodilla.rest.controller;

import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));  // zamiast rzeczywiście pobierać książki,
        booksList.add(new BookDto("Title 2", "Author 2"));  // mockowany serwis zawsze zwróci tę samą listę dwóch książek.
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        // when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);  // asercja kolekcji (listy, zestawy, mapy)
    }

    @Test
    void shouldAddBook() {
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);  // Mock serwisu BookService
        BookController bookController = new BookController(bookServiceMock);    // Tworzenie instacji kontrolera
        BookDto bookDto = new BookDto("Title 1", "Author");

        // when
        bookController.addBook(bookDto);

        // then
        verify(bookServiceMock).addBook(bookDto);   // weryfikacja, czy addBook() została wywołana z odpowiednim parametrem
    }

}
/*
BookService to serwis używany przez kontroler, który zarządza listą książek.
W testach jednostkowych nie testujemy rzeczywistego serwisu ani jego zachowań,
tylko to, jak działa kontroler w izolacji.
Dlatego BookService jest mockowany przy użyciu narzędzia Mockito:
 */