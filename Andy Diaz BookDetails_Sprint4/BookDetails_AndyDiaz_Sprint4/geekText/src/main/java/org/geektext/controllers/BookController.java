package org.geektext.controllers;


import org.geektext.model.Book;
import org.geektext.repository.BookRepository;
import org.geektext.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {



    BookService bookServiceTest;
    @Autowired
    public BookController(BookService bookServiceTest) {
        this.bookServiceTest = bookServiceTest;
    }
    private org.geektext.model.Book Book;

    @PostMapping("/loadBooks")
    public String loadBooks(Book books) { // Load 3 book objects to database
        bookServiceTest.addBooks(books);
        return "Books Loaded to Database";
    }


     //bookServiceTest.addBooks(Book);
       //    return "Books Loaded to Database";



    @Autowired
    private BookRepository testRepository;

    @GetMapping("/showBooks")
    public ResponseEntity<List<Book>> showBooks(@RequestParam(required = false) String bookID) {  // Return all book objects using REST/GET

        List<Book> books = new ArrayList<>();
        if (bookID != null) {
            books.addAll(testRepository.findBookById(bookID));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        books.addAll(testRepository.selectAllBooks());

        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(books, HttpStatus.OK);

        //return testRepository.findAll();

    }

}
