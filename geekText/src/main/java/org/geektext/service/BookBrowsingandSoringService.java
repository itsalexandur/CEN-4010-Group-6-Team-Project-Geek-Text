package org.geektext.service;

import org.geektext.model.Book;
import org.geektext.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class BookBrowsingandSoringService {

    public void BookBrowsingandSortingService() {}

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertBook(Book book){
        jdbcTemplate.update("INSERT INTO books (title, author, genre, description, publisher, copiesSold, isbn, price,rating) VALUES (?,?,?,?,?,?,?,?,?)",
                books.getTitle(), books.getAuthor(), books.getGenre(), books.getDescription(), books.getPublisher(),books.getCopiesSold(),books.getIsbn, books.getPrice(),books.getRating());
    }
    public List<User> selectAllBooks(){

        return jdbcTemplate.query("SELECT * FROM books",(rs, rosNum) ->
                new User(rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getString("publisher"),
                        rs.getInt("copiesSold"),
                        rs.getInt("isbn"),
                        rs.getInt("price"),
                        rs.getInt("rating")
                        ));
    }

    @Transactional
    @Override
    public int updatePrice(String Publisher, int updatePrice) {
        return jdbcTemplate.update("UPDATE books SET price= price*updatePrice WHERE publisher=Publisher",
                updatePrice.getTitle(),
                updatePrice.getAuthor(),
                updatePrice.getGenre(),
                updatePrice.getDescription(),
                updatePrice.getPublisher(),
                updatePrice.getCopiesSold(),
                updatePrice.getIsbn(),
                updatePrice.getPrice(),
                updatePrice.getRating(),
                , book);
    }


}
