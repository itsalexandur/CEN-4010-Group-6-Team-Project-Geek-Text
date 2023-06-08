package org.geektext.controllers;


import org.geektext.model.Book;
import org.geektext.repository.BookRepository;
import org.geektext.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
        // code to handle different endpoints


        @Autowired
        private BookRepository testRepository;

        @GetMapping("/testing/showBooks")
        public List<Book> getAllTestBooks() {

            return testRepository.findAll();
        }


        @Autowired
        BookService bookServiceTest;

        @GetMapping("/testing/loadBooks")
        public String loadBooks() {

            bookServiceTest.addBooks();
            return "Books Loaded (Testing)";
        }


    }
