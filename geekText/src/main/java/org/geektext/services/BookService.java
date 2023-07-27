package org.geektext.services;


import org.geektext.model.Book;
import org.geektext.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {


    @Autowired
    private BookRepository bRepo;

    public void addBooks() {
        // Mock book objects for testing database


        Book book1 = new Book("Dogs", "Sarah Wells", "Non-Fiction", "A book about dogs","123Books", 2001, 12, 101, 4.99, 2);
        Book book2 = new Book("Cats", "Ray Allen", "Fiction", "A book about cats", "FL_Times",2002, 14134, 102, 5.99, 3);
        Book book3 = new Book("Cows", "Mary Jones", "Non-Fiction", "A book about cars","FL_Times", 2005, 1345, 103, 6.99, 2);
        Book book4 = new Book("Cars", "John Doe", "Encyclopedia", "A book about cars","FL_Times", 2006, 53277, 104, 8.99, 3);
        Book book5 = new Book("Trucks", "Steven Rain", "Non-Fiction", "A book about trucks","123Books", 2012, 4356, 105, 21.99, 2);
        Book book6 = new Book("Planes", "Crystal Reed", "Encyclopedia", "A book about planes","FL_Times", 1998, 673, 106, 2.99, 1);
        Book book7 = new Book("Boats", "Barbara Knox", "Non-Fiction", "A book about boats", "Classics",2022, 4624, 107, 0.99, 2);
        Book book8 = new Book("Rivers", "Barbara Knight", "Encyclopedia", "A book about rivers","Classics", 1999, 624, 108, 39.99, 2);
        Book book9 = new Book("Oceans", "Sarah Bell", "Guide", "A book about oceans", "123Books",2000, 63524, 109, 49.99, 4);
        Book book10 = new Book("Lakes", "Joe Smith", "Encyclopedia", "A book about lakes","123Books", 2023, 5354, 110, 29.99, 4);
        Book book11 = new Book("Ponds", "Bobbie Smalls", "Guide", "A book about ponds", "FL_Times",2021, 548, 111, 24.99, 5);
        Book book12 = new Book("Mountains", "Howard Wayne", "Guide", "A book about mountains","FL_Times", 2018, 685, 112, 12.99, 5);
        Book book13 = new Book("Bears", "Laurie Fortune", "Encyclopedia", "A book about bears","123Books", 2009, 46, 113, 9.99, 3);

        bRepo.save(book1);
        bRepo.save(book2);
        bRepo.save(book3);
        bRepo.save(book4);
        bRepo.save(book5);
        bRepo.save(book6);
        bRepo.save(book7);
        bRepo.save(book8);
        bRepo.save(book9);
        bRepo.save(book10);

     }



}
