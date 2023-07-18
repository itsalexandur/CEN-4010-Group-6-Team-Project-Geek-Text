package org.geektext.repository;

import org.geektext.model.RatedBook;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RatedBookRepository extends JpaRepositoryImplementation<RatedBook, Long> {
    List<RatedBook> findRatedBooksByUserID(long userID);
}
