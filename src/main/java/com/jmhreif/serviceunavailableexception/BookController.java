package com.jmhreif.serviceunavailableexception;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
class BookController {
    private final BookRepository bookRepository;

    //Returns error
    @GetMapping
    List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    //Works
    @GetMapping("/works")
    List<Book> findAllBooksWorks() {
        return bookRepository.findAllBooks();
    }
}
