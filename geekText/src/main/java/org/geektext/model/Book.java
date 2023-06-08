package org.geektext.model;


import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {

    public Book() {}

    public Book(String title, String author, String genre, String description, int yearPublished, int isbn, double price) {

        this.setTitle(title);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setPrice(price);
        this.setDescription(description);
        this.setYearPublished(yearPublished);
        this.setIsbn(isbn);

    }

    public long getId() {
        return id;
    }

    @Id
    @Column (name = "bookID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto generates incremental ID value
    private long id;

    @Column(name = "title_string")
    private String title;
    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "description")
    private String description;

    @Column(name = "year published")
    private int yearPublished;

    @Column(name = "isbn")
    private int isbn;

    @Column(name = "price")
    private double price;




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
