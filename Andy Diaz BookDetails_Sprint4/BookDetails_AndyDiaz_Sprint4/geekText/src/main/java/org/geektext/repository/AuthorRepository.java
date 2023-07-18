package org.geektext.repository;

import org.geektext.model.Author;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface AuthorRepository extends JpaRepositoryImplementation <Author, Long> {
    // all crud database methods

    List<Author> selectAllAuthors();

    Collection<? extends Author> findBookByAuthor(String authorID);

}
