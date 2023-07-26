package org.geektext.repository;

import org.geektext.model.SavedBook;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SavedBookRepository extends JpaRepositoryImplementation<SavedBook, Long> {
      // all crud database methods

      List<SavedBook> findSavedBooksByUserID(long userID);


}
