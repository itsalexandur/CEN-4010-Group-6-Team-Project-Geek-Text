package org.geektext.services;


import org.geektext.model.Author;
import org.geektext.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {


    @Autowired
    AuthorRepository authorRepo;

    public void addAuthors() {

        Author a1 = new Author("John","Doe", "He's a cool dude.", "Macmillan");
        Author a2 = new Author("Jim","John", "He's also cool.", "Chronicle");
        Author a3 = new Author("Jane","Doe", "She is the most cool.", "Simon & Schuster");

        authorRepo.save(a1);
        authorRepo.save(a2);
        authorRepo.save(a3);


    }
}
