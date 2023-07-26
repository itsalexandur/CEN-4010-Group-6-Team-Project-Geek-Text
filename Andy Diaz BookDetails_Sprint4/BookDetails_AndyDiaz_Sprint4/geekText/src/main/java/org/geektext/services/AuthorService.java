package org.geektext.services;


import org.geektext.model.Author;
import org.geektext.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;


@Service
public class AuthorService {


    @Autowired
    private AuthorRepository authorRepo;
    private JdbcTemplate jdbcTemplate;

    public int addAuthors(Author author) {


        // Mock author objects for testing database
        Author a1 = new Author("John","Doe", "He's a cool dude.", "Macmillan");
        Author a2 = new Author("Sarah","Wells", "A gal named Sarah.", "Chronicle");
        Author a3 = new Author("Ray","Allen", "He the most cool.", "Simon & Schuster");
        Author a4 = new Author("Mary","Jones", "Mary is from the U.S", "Norwegian");
        Author a5 = new Author("Steven","Rain", "Steven likes pasta.", "Harper Collins");
        Author a6 = new Author("Joe","Smith", "Joe is from Michigan", "Random House");
        Author a7 = new Author("Crystal","Reed", "Crystal likes hiking.", "Scholastic");
        Author a8 = new Author("Barbara","Knox", "Barbara is a twin", "Penguin House");

        authorRepo.save(a1);
        authorRepo.save(a2);
        authorRepo.save(a3);
        authorRepo.save(a4);
        authorRepo.save(a5);
        authorRepo.save(a6);
        authorRepo.save(a7);
        authorRepo.save(a8);

        return jdbcTemplate.update("insert into authors(firstName, lastName, bio, publisher) " +
                        "values(?,?,?,?)",
                new Object[]{author.getFirstName(),author.getLastName(),author.getBio(),
                        author.getPublisher()});
    }

    public List<Author>selectAllAuthors() {
        return jdbcTemplate.query("Select * from authors", (rs,rosnum)->
                new Author(rs.getString("title_string"),
                        rs.getString("author"),
                        rs.getString("genre"),
                        rs.getString("description")));
    }
}
