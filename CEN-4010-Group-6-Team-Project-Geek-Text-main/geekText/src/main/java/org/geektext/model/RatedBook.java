package org.geektext.model;
import jakarta.persistence.*;

@Entity
@Table(name = "ratedbooks")
public class RatedBook {
    public RatedBook(){};
    public RatedBook(Book book, User user, int bookRating) {

        this.bookID = book.getId();
        this.userID = user.getId();
        this.id = getId();
        this.bookRating = bookRating;

    }

    //private int rating;
    @Id
    private long id;
    @Column(name = "bookID")
    private long bookID;

    @Column(name = "userID")
    private long userID;

    @Column(name = "bookRating")
    private int bookRating;

    //public RatedBook(Book ratedBook, User userTarget, int bookRating) {
    //}
    public long getId() {
        return id;
    }
    public long getUserID() {
        return userID;
    }
    public void setUserID(long userID) {
        this.setUserID(userID);
    }

    public long getBookID() {
        return bookID;
    }
    public void setBookID(long bookID) {
        this.bookID = bookID;
    }

    public int getRating() {
        return bookRating;
    }
    public void setRating(int bookRating) {
        this.bookRating = bookRating;
    }

}
