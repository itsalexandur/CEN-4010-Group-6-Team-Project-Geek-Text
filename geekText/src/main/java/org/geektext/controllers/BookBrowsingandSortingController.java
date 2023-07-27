package org.geektext.controllers;


import org.geektext.model.Book;
import org.geektext.model.SavedBook;
import org.geektext.model.User;
import org.geektext.repository.BookRepository;
import org.geektext.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookBrowsingandSortingController {

    @GetMapping({"/findBookByGenre/{genre}"})
    public List<Book> findBookByGenre(@PathVariable String genre) {
        List<Book> BookList = bookRepository.findAll(
        return bookRepository.findAll();
    }


    @GetMapping({"/{userID}/cart/books"})
    public List<SavedBook> showBooksInCart(@PathVariable("userID") long userID) {
        return this.BookService.ShowBooks(Genre);
    }



    @GetMapping("/showUsers")
    public List<User> getAllUsers() {
        // Returns list of saved users

        return userRepository.findAll();
    }


    }




