package org.geektext.controllers;


import org.geektext.model.Author;
import org.geektext.model.Book;
import org.geektext.repository.AuthorRepository;
import org.geektext.services.AuthorService;
import org.geektext.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthorController {


    @Autowired
    AuthorService authorServiceTest;

    public AuthorController(AuthorService authorServiceTest) {
        this.authorServiceTest = authorServiceTest;
    }
    private org.geektext.model.Author Author;

    @PostMapping("/loadAuthors")
    public String loadAuthors(Author authors) { // Load 3 Author objects to database

        authorServiceTest.addAuthors(authors);
        return "Authors Loaded to Database";
    }


    @Autowired
    private AuthorRepository authorRepo;

    @GetMapping("/showAuthors")
    public ResponseEntity<List<Author>> showAuthors(@RequestParam(required = false) String authorID) { // Return all Author objects using REST/GET

        List<Author> authors = new ArrayList<>();
        if (authorID != null) {
            authors.addAll(authorRepo.findBookByAuthor(authorID));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        authors.addAll(authorRepo.selectAllAuthors());

        if (authors.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(authors, HttpStatus.OK);

//        return authorRepo.findAll();

    }

}
