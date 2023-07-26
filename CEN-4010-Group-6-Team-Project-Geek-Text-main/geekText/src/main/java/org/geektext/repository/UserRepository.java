package org.geektext.repository;

import org.geektext.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Long> {
    // all crud database methods

      User findUserById(long userID);
     //User findUserBy(String firstname, String lastname);

}
