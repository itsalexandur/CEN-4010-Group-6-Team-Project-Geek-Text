package org.geektext.repository;

import org.geektext.model.Book;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface BookRepository extends JpaRepositoryImplementation<Book, Long> {
    // all crud database methods

     List<Book> selectAllBooks();

     Collection<? extends Book> findBookById(String bookID);

}


