package org.geektext.services;
import org.geektext.model.*;
import org.geektext.repository.BookRepository;
import org.geektext.repository.RatedBookRepository;
import org.geektext.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingService {
    @Autowired
    RatedBookRepository ratedBookRepo;

    @Autowired
    BookRepository bookRepo;

    @Autowired
    UserRepository userRepo;

    public void ratedBook(long bookID, long userID, int bookRating) {


        Book rated = bookRepo.findBookById(bookID);
        User userTarget = userRepo.findUserById(userID);
        int rate = ratedBookRepo.findRatedBooksByUserID(bookRating);

        RatedBook rateBook = new RatedBook(rated,userTarget,rate);
        ratedBookRepo.save(rateBook);

    }
    public List<RatedBook> ShowBookRatings(long bookRating) {
        // Returns all books in users shopping cart

        List<RatedBook> ratedBooks =  ratedBookRepo.findRatedBooksByUserID(bookRating);

        return ratedBooks;
    }
}
