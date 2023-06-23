package org.geektext.dao;

import org.geektext.model.Person;

import java.util.UUID;
import java.util.List;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    int deletePersonByID(UUID id);

    int updatePersonById(UUID  id, Person person);
}
