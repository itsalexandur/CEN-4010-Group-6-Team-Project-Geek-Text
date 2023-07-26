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

        Book book1 = new Book("Dogs","Sarah Wells","Non-Fiction","A book about dogs." ,2005,10456, 12345685,5.99);
        Book book2 = new Book("Cats","Ray Allen","Fiction","A book about cats." ,2005,3354, 65854521,2.99);
        Book book3 = new Book("Cows","Mary Jones","Non-Fiction","A book about cows." ,2008,21021, 12546685,12.99);
        Book book4 = new Book("Cars","John Doe","Fiction","A book about cars." ,2008,21021, 12546685,9.99);
        Book book5 = new Book("Trucks","Steven Rain","Non-Fiction","A book about trucks." ,2008,21021, 12546685,14.25);
        Book book6 = new Book("Planes","Crystal Reed","Non-Fiction","A book about planes." ,2008,21021, 12546685,13.55);
        Book book7 = new Book("Boats","Barbara Knox","Fiction","A book about boats." ,2008,21021, 12546685,22.22);
        Book book8 = new Book("Rivers","Barbara Knox","Non-Fiction","A book about rivers." ,2008,21021, 12546685,1.99);
        Book book9 = new Book("Oceans","Sarah Wells","Non-Fiction","A book about oceans." ,2008,21021, 12546685,18.25);
        Book book10 = new Book("Lakes","Joe Smith","Non-Fiction","A book about lakes." ,2008,21021, 12546685,4.85);

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
