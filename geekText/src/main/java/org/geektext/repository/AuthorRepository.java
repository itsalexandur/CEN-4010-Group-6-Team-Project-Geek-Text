package org.geektext.repository;

import org.geektext.model.Author;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends JpaRepositoryImplementation <Author, Long> {
    // all crud database methods
}
