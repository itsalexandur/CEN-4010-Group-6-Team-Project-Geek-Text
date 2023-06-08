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
        Book book1 = new Book("Dogs","Sarah Wells","Non-Fiction","A book about dogs." ,2005, 12345685,5.99);
        Book book2 = new Book("Cats","Ray Allen","Fiction","A book about cats." ,2006, 65854521,2.99);
        Book book3 = new Book("Cows","Joe Smith","Non-Fiction","A book about cows." ,2008, 12546685,9.99);
        bRepo.save(book1);
        bRepo.save(book2);
        bRepo.save(book3);
     }



}
