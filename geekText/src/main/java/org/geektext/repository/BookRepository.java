package org.geektext.repository;

import org.geektext.model.Book;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepositoryImplementation<Book, Long> {
    // all crud database methods

     Book findBookById(long bookID);


}


